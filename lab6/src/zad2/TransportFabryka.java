package zad2;

public abstract class TransportFabryka {
    protected abstract Order deliverWay();

    private String prepareTransport(String name){
        System.out.println(name+ "został przygotowany do transportu");
        return name;
    }

    public void sendTransport(String name){
        String transport = prepareTransport(name);
        Order deliver = deliverWay();
        deliver.deliver(transport);
    }
}
