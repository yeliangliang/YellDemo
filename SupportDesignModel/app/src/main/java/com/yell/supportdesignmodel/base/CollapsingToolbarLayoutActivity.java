package com.yell.supportdesignmodel.base;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.yell.supportdesignmodel.R;

/**
 * @author yeliangliang
 */
public class CollapsingToolbarLayoutActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_demo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new ModelRecyclerAdapter());

        CollapsingToolbarLayout titleLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolBarLayout);
        //Title的必须设置在CollapsingToolbarLayout上
        titleLayout.setTitle("CollapsingToolbarLayoutDemo");

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.drawable.icon_toolbar_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
