package com.sudipta.mytoast;

import android.content.Context;
import android.widget.Toast;

public class myToast {

    public static void simpleToast(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
