package kr.co.yhw.javabasicpractice_20200520;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import kr.co.yhw.javabasicpractice_20200520.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputId = binding.idEdt.getText().toString();
                String inputPw = binding.pwEdt.getText().toString();

//                Log.d("입력아이디", inputId);
//                Log.d("입력비번", inputPw);
//              안드로이드 sdk에서의 String 비교는 == 이 동작하지 않는다.
//                이클립스에서는 가능했지만 여기선 안됨
//                .equals로 비교
                if ( inputId.equals("admin") && inputPw.equals("qwer") ){
                    Toast.makeText(MainActivity.this, "관리자입니다.", Toast.LENGTH_SHORT).show();
                }
                else {
//                    Log.d("아이디 확인","관리자아님");
                    Toast.makeText(MainActivity.this, "로그인에 실패 했습니다..", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
