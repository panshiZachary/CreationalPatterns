package com.example.creationalpatterns.simplefactory;

/**
 * Created by Zachary
 * on 2019/1/10.
 */
public class Factory {

    public static Api create(int type){
        switch (type){
            case 1:
            return new A();
            case 2:
                return new B();
            case 3:
                return new C();
                default:
                    return new A();
        }

    }

    public static <T extends Api> T cteateApi(Class<T> clazz){

        Api api = null;
        try {
            api = (Api) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) api;

    }
}
