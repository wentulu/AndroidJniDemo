package cn.stu.cusview.ruiz.jnidemo2;

public class JniTest2Util {

    static {
        System.loadLibrary("jni_test");
    }

    public native String greetFromJni();

}
