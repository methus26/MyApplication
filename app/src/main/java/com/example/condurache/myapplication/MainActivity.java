package com.example.condurache.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

/**
 * scjp chap1
 * <p>
 * https://www.quora.com/What-are-some-concepts-algorithms-data-structures-that-every-computer-science-student-should-know
 * http://www.javaworld.com/article/2073390/core-java/datastructures-and-algorithms-part-1.html
 *
 *
 *https://en.wikipedia.org/wiki/Greatest_common_divisor
 * https://en.wikipedia.org/wiki/Primality_test
 */
public class MainActivity extends AppCompatActivity implements Runnable {

    private int i;

    public synchronized void run() {
        if (i % 5 != 0) {
            i++;
        }
        for (int x = 0; x < 5; x++, i++) {
            if (x > 1) Thread.yield();
        }
        System.out.print(i + " ");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int x=100; x>0; --x) { new Thread(this).start(); }
    }
}
