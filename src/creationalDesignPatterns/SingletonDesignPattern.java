package src.creationalDesignPatterns;
public class SingletonDesignPattern {
    private SingletonDesignPattern(){}

    private static class SingletonDesignPatternHelper{
        private static final SingletonDesignPattern INSTANCE = new SingletonDesignPattern();
    }

    public static SingletonDesignPattern getInstance(){
        return SingletonDesignPatternHelper.INSTANCE;
    }
}
