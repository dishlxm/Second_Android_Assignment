package zju.edu.myrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] content = {
            "首都新阶层奔跑追梦",
            "张晓晨结婚",
            "王菲迷弟马天宇",
            "仙某某微博杯送福利",
            "阿联酋富豪拖南极冰山回国",
            "曾经很火但是消失了的品牌",
            "Jennie白色眼影",
            "柯基的基因有多强大",
            "未来5年电竞人才需200万",
            "人社部回应80后无养老金",
            "驾轿车撞学生致6死20伤案被...",
            "蜜桃少女装大赛",
            "最惨瓶盖挑战",
            "假如三代蜘蛛侠同框",
            "郑爽道歉",
            "在雅典娜实现车厘子自由",
            "浙大女生遇害案家属放弃赔偿",
            "雎晓雯封面",
            "皮肤黑却漂亮的女生",
            "迪士尼公主戒指",
            "湖南1天内868个乡镇暴雨",
    };

    private int[] HotNum={
            3923226,
            1366605,
            1317707,
            1305483,
            1302121,
            806145,
            752348,
            670172,
            669949,
            669836,
            669518,
            669044,
            668622,
            668594,
            668219,
            667714,
            667470,
            667248,
            667070,
            611487,
            608434,
            575498
    };

    private List<filelist> mDatas;
    private myRecycleradatper recycleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatas = new ArrayList<filelist>();
        filelist fl;
        String zt;
        String hot;
        for ( int i=0; i < 20; i++) {
            zt = content[i]+"   ";
            hot = HotNum[i]+"";
            if(i==1||i==11)
                fl=new filelist((i+1)+". ",zt,R.drawable.hot_pic,hot);
            else if(i==4||i==23)
                fl=new filelist((i+1)+". ",zt,R.drawable.new_pic,hot);
            else
                fl=new filelist((i+1)+". ",zt,R.drawable.bbb,hot);
            mDatas.add(fl);
        }

        recycleAdapter=new myRecycleradatper(this,mDatas);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recy_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this );
        recyclerView.setLayoutManager(layoutManager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        recyclerView.setHasFixedSize(true);
        //创建并设置Adapter
        recyclerView.setAdapter(recycleAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
