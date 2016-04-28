package xyz.yluo.ruisiapp.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.yluo.ruisiapp.PublicData;
import xyz.yluo.ruisiapp.R;
import xyz.yluo.ruisiapp.View.MyWebView;


/**
 * Created by yluo on 2015/10/5 0005.
 * 关于页面
 */
public class AboutActivity extends BaseActivity {

    @Bind(R.id.mywebview)
    protected MyWebView mywebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        String ss = "西电睿思手机客户端\n目前可见bug很多，最近比较忙我也不会去修复他。。。" +
                "\nbug反馈点击按钮给我发邮件吧\n或者 <a href=\"home.php?mod=space&uid=252553&do=profile&mobile=2\">" +
                "@谁用了FREEDOM</a>或者<a href=\"home.php?mod=space&uid=261098&do=profile&mobile=2\">@wangfuyang</a>";
        mywebview.loadDataWithBaseURL(PublicData.BASE_URL,ss,"text/html","UTF-8",null);
    }


    @OnClick(R.id.fab)
    protected void fab_clidk(View view){
        Snackbar.make(view, "别点了，还没写", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

}
