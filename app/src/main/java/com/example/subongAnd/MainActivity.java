package com.example.subongAnd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_login_id,et_login_pw;
    Button btn_login,btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_login_id=findViewById(R.id.et_login_id);
        et_login_pw=findViewById(R.id.et_login_pw);
        btn_login=findViewById(R.id.btn_login);
        btn_signup=findViewById(R.id.btn_signup);

        // 1. 값을 가져오고
        // 2. 클릭 감지
        // 3. 값 이동

        // ++ 로그인 시 조건 추가 가능 / 아이디 비밀번호 길이 등


       btn_login.setClickable(true);
       btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String id = et_login_id.getText().toString();
                String pw = et_login_pw.getText().toString();

                Intent intent = new Intent(MainActivity.this, LoginResultActivity.class);
                intent.putExtra("id",id);
                intent.putExtra("pw",pw);
                startActivity(intent);

            }
        });

        btn_signup.setClickable(true);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });


    }
}