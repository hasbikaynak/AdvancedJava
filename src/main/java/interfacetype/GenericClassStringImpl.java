package interfacetype;

//while implementing generic interface to create normal class, you must provide a proper data type

public class GenericClassStringImpl implements GenericInterface<String>{
    @Override
    public void setValue(String s) {

    }

    @Override
    public String getValue() {
        return null;
    }
}
