//package com.example.footprint;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//
//public class MainActivity extends AppCompatActivity {
//
//    //声明控件
//    private Button mBtnLogin;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        //找到控件
//        mBtnLogin = findViewById(R.id.bt_login);
//
//        //跳转
//        mBtnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = null;
//                intent = new Intent(MainActivity.this, GuideActivity.class);
//                startActivity(intent);
//            }
//        });
//
//
//    }
//}
package com.example.footprint;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.os.Looper;
        import android.os.Message;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.example.footprint.dao.UserDao;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //声明控件
    private Button mBtnLogin,mBtnReg;
    private EditText mName;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        mBtnLogin = findViewById(R.id.button2);
        mBtnReg = findViewById(R.id.button3);

        mName = findViewById(R.id.name);
        mPassword = findViewById(R.id.password);

        //跳转
        mBtnReg.setOnClickListener(this::reg);
        mBtnLogin.setOnClickListener(this::login);



    }



    public void reg(View view){

        Intent intent = null;
        intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);

    }


    public void login(View view){
        String username = mName.getText().toString();
        String userpassword = mPassword.getText().toString();
        Intent intent = null;
        if(username.equals("Lihan")&&userpassword.equals("123456")){
            intent = new Intent(MainActivity.this, GuideActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"登录失败",Toast.LENGTH_LONG).show();
        }



//        EditText EditTextname = (EditText)findViewById(R.id.name);
//        EditText EditTextpassword = (EditText)findViewById(R.id.password);
//
//        new Thread(){
//            @Override
//            public void run() {
//
//                UserDao userDao = new UserDao();
//
//                boolean aa = userDao.login(EditTextname.getText().toString(),EditTextpassword.getText().toString());
//                int msg = 0;
//                if(aa){
//                    msg = 1;
//                }
//
//                hand1.sendEmptyMessage(msg);
//
//
//            }
//        }.start();


    }
    final Handler hand1 = new Handler(Looper.getMainLooper())
    {
        @Override
        public void handleMessage(Message msg) {

            if(msg.what == 1)
            {
                Toast.makeText(getApplicationContext(),"登录成功",Toast.LENGTH_LONG).show();

            }
            else
            {
                Toast.makeText(getApplicationContext(),"登录失败",Toast.LENGTH_LONG).show();
            }
        }
    };


    @Override
    public void onClick(View v) {

    }
}
