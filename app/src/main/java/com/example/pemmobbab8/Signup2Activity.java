//package com.example.pemmobbab8;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//
//public class Signup2Activity extends AppCompatActivity {
//    EditText username, password, nim, kelas, email;
//    Button signup;
////    ProgressBar progressBar;
//    FirebaseAuth fAuth;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_signup);
//        username = findViewById(R.id.Username);
//        email = findViewById(R.id.email);
//        password = findViewById(R.id.password);
//        nim = findViewById(R.id.NIM);
//        kelas = findViewById(R.id.kelas);
//        signup = findViewById(R.id.signup);
//
//        fAuth = FirebaseAuth.getInstance();
//        if (fAuth.getCurrentUser() !=null){
//            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
//            finish();
//        }
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String nama             = username.getText().toString();
//                String emailregis       = email.getText().toString().trim();
//                String passwordregis    = password.getText().toString().trim();
//                String nimregis         = nim.getText().toString();
//                String kelasregis       = kelas.getText().toString();
//                if (TextUtils.isEmpty(emailregis)){
//                    email.setError("Email Dibutuhkan");
//                    return;
//                }
//                if (TextUtils.isEmpty(passwordregis)){
//                    password.setError("Password Dibutuhkan");
//                    return;
//                }
//                if (TextUtils.isEmpty(nama)) {
//                    username.setError("Username Dibutuhkan");
//                    return;
//                }
//                if (TextUtils.isEmpty(nimregis)){
//                    nim.setError("NIM Dibutuhkan");
//                    return;
//                }
//                if (TextUtils.isEmpty(kelasregis)){
//                    kelas.setError("Kelas Dibutuhkan");
//                    return;
//                }
//                if (passwordregis.length()< 6){
//                    password.setError("Password harus lebih dari 6 karakter");
//                    return;
//                }
//                fAuth.createUserWithEmailAndPassword(emailregis,passwordregis).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            Toast.makeText(Signup2Activity.this, "Akun Terbuat", Toast.LENGTH_SHORT).show();
//                            startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
//                        }else {
//                            Toast.makeText(Signup2Activity.this, "Akun Gagal Dibuat"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//
//                        }
//                    }
//
//                });
//            }
//        });
//    }
//    public void pindahHomeActivity(View view){
//        Intent intent = new Intent(this, HomeActivity.class);
//        startActivity(intent);
//    }
//}