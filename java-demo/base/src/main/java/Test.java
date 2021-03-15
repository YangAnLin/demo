import com.spw.proto2.*;
import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {

//        userList();

//        getuser();

//        setuser();

        upuser();

    }

    // 添加
    public static void upuser() throws InterruptedException {

        //只有当流结束或者发生异常时才终止,不然就一直等待，可以在调用时判断时间防止一直等待
        final CountDownLatch finishLatch = new CountDownLatch(1);

        //通过netty创建通道
        ManagedChannel channel = NettyChannelBuilder.forAddress("167.179.69.66", 10000).negotiationType(NegotiationType.PLAINTEXT).build();
        TrojanServerServiceGrpc.TrojanServerServiceStub trojanServerServiceStub = TrojanServerServiceGrpc.newStub(channel);

        Traffic.Builder traffic = Traffic.newBuilder();
        traffic.setDownloadTraffic(100l);
        traffic.setUploadTraffic(200l);

        Speed.Builder speed = Speed.newBuilder();
        speed.setDownloadSpeed(9999l);
        speed.setUploadSpeed(9999l);

        UserStatus.Builder userStatus = UserStatus.newBuilder();
        userStatus.setUser(User.newBuilder().setPassword("1234567"));
        userStatus.setTrafficTotal(traffic);
        userStatus.setSpeedLimit(speed);
        userStatus.setIpLimit(5);

        SetUsersRequest.Builder setUserRequest = SetUsersRequest.newBuilder();
        setUserRequest.setStatus(userStatus);
        setUserRequest.setOperation(SetUsersRequest.Operation.Modify);

        StreamObserver<SetUsersRequest> userRequestStreamObserver = trojanServerServiceStub.setUsers(new StreamObserver<SetUsersResponse>() {

            @Override
            public void onNext(SetUsersResponse setUsersResponse) {
                System.out.println(".." + setUsersResponse);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        userRequestStreamObserver.onNext(setUserRequest.build());
        finishLatch.await();
    }

    // 添加
    public static void setuser() throws InterruptedException {

        //只有当流结束或者发生异常时才终止,不然就一直等待，可以在调用时判断时间防止一直等待
        final CountDownLatch finishLatch = new CountDownLatch(1);

        //通过netty创建通道
        ManagedChannel channel = NettyChannelBuilder.forAddress("167.179.69.66", 10000).negotiationType(NegotiationType.PLAINTEXT).build();
        TrojanServerServiceGrpc.TrojanServerServiceStub trojanServerServiceStub = TrojanServerServiceGrpc.newStub(channel);

        Traffic.Builder traffic = Traffic.newBuilder();
        traffic.setDownloadTraffic(0l);
        traffic.setUploadTraffic(0l);

        Speed.Builder speed = Speed.newBuilder();
        speed.setDownloadSpeed(0l);
        speed.setUploadSpeed(0l);

        UserStatus.Builder userStatus = UserStatus.newBuilder();
        userStatus.setUser(User.newBuilder().setPassword("1234567"));
        userStatus.setTrafficTotal(traffic);
        userStatus.setSpeedLimit(speed);
        userStatus.setIpLimit(5);

        SetUsersRequest.Builder setUserRequest = SetUsersRequest.newBuilder();
        setUserRequest.setStatus(userStatus);
        setUserRequest.setOperation(SetUsersRequest.Operation.Add);

        StreamObserver<SetUsersRequest> userRequestStreamObserver = trojanServerServiceStub.setUsers(new StreamObserver<SetUsersResponse>() {

            @Override
            public void onNext(SetUsersResponse setUsersResponse) {
                System.out.println(".." + setUsersResponse);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        userRequestStreamObserver.onNext(setUserRequest.build());
        finishLatch.await();
    }

    // 获取单个用户
    public static void getuser() throws InterruptedException {

        //只有当流结束或者发生异常时才终止,不然就一直等待，可以在调用时判断时间防止一直等待
        final CountDownLatch finishLatch = new CountDownLatch(1);

        //通过netty创建通道
        ManagedChannel channel = NettyChannelBuilder.forAddress("167.179.69.66", 10000).negotiationType(NegotiationType.PLAINTEXT).build();
        TrojanServerServiceGrpc.TrojanServerServiceStub trojanServerServiceStub = TrojanServerServiceGrpc.newStub(channel);

        User.Builder builder = User.newBuilder().setPassword("1234567");
        GetUsersRequest.Builder builder1 = GetUsersRequest.newBuilder();
        builder1.setUser(builder);
        GetUsersRequest build = builder1.build();


        StreamObserver<GetUsersRequest> userRequestStreamObserver = trojanServerServiceStub.getUsers(new StreamObserver<GetUsersResponse>() {
            @Override
            public void onNext(GetUsersResponse getUsersResponse) {

                System.out.println("onNext:"+getUsersResponse);

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        userRequestStreamObserver.onNext(build);

        /**
         * 阻塞直到结束，建议加上超时时间 eg : finishLatch.await(1,TimeUnit.SECONDS)
         */
        finishLatch.await();

    }

    // 用户列表
    public static void userList() {
        //通过netty创建通道
        ManagedChannel channel = NettyChannelBuilder.forAddress("167.179.69.66", 10000)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();

        TrojanServerServiceGrpc.TrojanServerServiceBlockingStub blockingStub2 = TrojanServerServiceGrpc.newBlockingStub(channel);
        ListUsersRequest listUsersRequest = ListUsersRequest.newBuilder().build();
        Iterator<ListUsersResponse> listUsersResponseIterator = blockingStub2.listUsers(listUsersRequest);

        while (listUsersResponseIterator.hasNext()) {
            System.out.println(listUsersResponseIterator.next());

        }
    }
}
