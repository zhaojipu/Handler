package a001.and.com.homeworkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.LinkedList;

public class ListViewActivity extends AppCompatActivity {

    String TAG="ListViewActivity";
    ListView listView;
    ImageView ivEmpty;
    ViewHolderAdapter adapter;
    LinkedList<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        initView();
        initData();
    }

    private void initData() {
        data=new LinkedList<>();

        for(int i=0;i<40;i++){
            data.add("第"+(i+1)+"个item");
        }
        adapter=new ViewHolderAdapter(this,data);
        listView.setAdapter(adapter);
        if (adapter!=null)
            adapter.notifyDataSetChanged();
    }

    private void initView() {
        listView= (ListView) findViewById(R.id.listview);
        ivEmpty= (ImageView) findViewById(R.id.iv_emptyView);

        listView.setEmptyView(ivEmpty);

    }
}
