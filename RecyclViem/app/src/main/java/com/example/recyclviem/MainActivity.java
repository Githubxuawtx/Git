<<<<<<< HEAD
<<<<<<< HEAD
package com.example.recyclviem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] names = { "小猫", "哈士奇", "小黄鸭","小鹿","老虎"};
    private int[]  icons= { R.drawable.cat,
            R.drawable.siberiankusky,
            R.drawable.yellowduck,
            R.drawable.fawn,
            R.drawable.tiger};
    private String[] introduces = new String[]{
            "猫，属于猫科动物，分家猫、野猫，是全世界家庭中较为广泛的宠物。",
            "西伯利亚雪橇犬，常见别名哈士奇，昵称为二哈。",
            "鸭的体型相对较小，颈短，一些属的嘴要大些。腿位于身体后方，因而步态蹒跚。",
            "鹿科是哺乳纲偶蹄目下的一科动物。体型大小不等，为有角的反刍类。",
            "虎，大型猫科动物；毛色浅黄或棕黄色，满有黑色横纹；头圆、耳短，耳背面黑色，中央有一白斑甚显著；四肢健壮有力；尾粗长，具黑色环纹，尾端黑色。"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView =findViewById(R.id.recyler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_layout);
        TmpAdpter adpter=new TmpAdpter();
        recyclerView.setAdapter(adpter);
    }
    class  TmpAdpter extends RecyclerView.Adapter {


        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

          holder.iv.setImageResource(icons[position]);

        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            TmpAdpter.ViewHolder holder=new TmpAdpter.ViewHolder(
                   LayoutInflater.from(MainActivity.this).inflate(R.layout.item_layout,parent,false));

           return holder;
        }
        @Override
        public int getItemCount() {
            return names.length;
        }
        class ViewHolder extends RecyclerView.ViewHolder {
                TextView name;
                ImageView iv;
                TextView introduce;

        public ViewHolder(View view) {
                super(view);
                iv = view.findViewById(R.id.iv);
                name = view.findViewById(R.id.name);
                introduce = view.findViewById(R.id.introduce);

            }


        }
    }
}
=======
=======
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
package com.example.recyclviem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] names = { "小猫", "哈士奇", "小黄鸭","小鹿","老虎"};
    private int[]  icons= { R.drawable.cat,
            R.drawable.siberiankusky,
            R.drawable.yellowduck,
            R.drawable.fawn,
            R.drawable.tiger};
    private String[] introduces = new String[]{
            "猫，属于猫科动物，分家猫、野猫，是全世界家庭中较为广泛的宠物。",
            "西伯利亚雪橇犬，常见别名哈士奇，昵称为二哈。",
            "鸭的体型相对较小，颈短，一些属的嘴要大些。腿位于身体后方，因而步态蹒跚。",
            "鹿科是哺乳纲偶蹄目下的一科动物。体型大小不等，为有角的反刍类。",
            "虎，大型猫科动物；毛色浅黄或棕黄色，满有黑色横纹；头圆、耳短，耳背面黑色，中央有一白斑甚显著；四肢健壮有力；尾粗长，具黑色环纹，尾端黑色。"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView =findViewById(R.id.recyler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_layout);
        TmpAdpter adpter=new TmpAdpter();
        recyclerView.setAdapter(adpter);
    }
    class  TmpAdpter extends RecyclerView.Adapter {


        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

          holder.iv.setImageResource(icons[position]);

        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            TmpAdpter.ViewHolder holder=new TmpAdpter.ViewHolder(
                   LayoutInflater.from(MainActivity.this).inflate(R.layout.item_layout,parent,false));

           return holder;
        }
        @Override
        public int getItemCount() {
            return names.length;
        }
        class ViewHolder extends RecyclerView.ViewHolder {
                TextView name;
                ImageView iv;
                TextView introduce;

        public ViewHolder(View view) {
                super(view);
                iv = view.findViewById(R.id.iv);
                name = view.findViewById(R.id.name);
                introduce = view.findViewById(R.id.introduce);

            }


        }
    }
}
<<<<<<< HEAD
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
=======
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
