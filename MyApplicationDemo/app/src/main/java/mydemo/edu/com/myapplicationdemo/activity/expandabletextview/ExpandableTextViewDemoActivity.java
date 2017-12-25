package mydemo.edu.com.myapplicationdemo.activity.expandabletextview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mydemo.edu.com.myapplicationdemo.R;

/**
 * Created by Administrator on 2017/9/30.
 * <p>
 * 可展开的textview
 */

public class ExpandableTextViewDemoActivity  extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_textview);
        ExpandableTextView tv = (ExpandableTextView) findViewById(R.id.tv);
        tv.setText("五月天，台湾摇滚乐团，由乐队团长兼吉他手怪兽、主唱阿信、吉他手石头、贝斯玛莎和鼓手冠佑组成，前身为“So Band”乐团，在1997年3月29日更名为“五月天”。1999年，发行首张专辑《第一张创作专辑》，截至2012年6月，四次拿下\"台湾金曲奖\"和“最佳乐团奖”。\n" +
                "\n" +
                "小档案\n" +
                "\n" +
                "乐队吉他手：怪兽   \n" +
                "本名：温尚翊\n" +
                "别名：怪兽\n" +
                "英文名：Wen, Monster \n" +
                "生日：1976年11月28日\n" +
                "生肖：龙\n" +
                "出生地：新竹\n" +
                "身高：168cm \n" +
                "体重：62kg \n" +
                "血型：A型\n" +
                "星座：射手座\n" +
                "体重：62公斤\n" +
                "嗜好：运动\n" +
                "乐器：吉他\n" +
                "喜爱的歌手：Beatles、Mr.Children、U2、Oasis\n" +
                "喜爱的乐手：松元孝宏\n" +
                "学历：台湾大学社会系社会组\n" +
                "接触音乐历程：高中学吉他，之后开始接触电吉他并组团，高中毕业与阿信、马莎组成So Band，后改为五月天\n" +
                "音乐经历：ㄞ国歌曲合辑、拥抱专辑制作\n" +
                "\n" +
                " \n" +
                "\n" +
                "乐队主唱：阿信\n" +
                "本名：陈信宏\n" +
                "别名：阿信\n" +
                "英文名：Ashin \n" +
                "生日：1975年12月6日\n" +
                "生肖：兔\n" +
                "出生地：台北北投\n" +
                "身高：180cm\n" +
                "体重：74kg \n" +
                "血型：O型\n" +
                "星座：射手座\n" +
                "嗜好：吃饭睡觉\n" +
                "乐器：吉他\n" +
                "喜爱的歌手：披头四(Beatles)、罗大佑、伍佰、Mr.Children\n" +
                "喜爱的乐手：菜篮哺乳(China Blue)\n" +
                "学历：实践大学室内设计系\n" +
                "接触音乐历程：So Band、Mayday\n" +
                "音乐经历：歌曲合辑、拥抱专辑制作\n" +
                " \n" +
                "\n" +
                "乐队吉他手：石头\n" +
                "别 名：石航玮\n" +
                "英文名：Richard Stone\n" +
                "生 日：1975/12/11\n" +
                "生肖：兔\n" +
                "出生地：台北\n" +
                "血 型：B型\n" +
                "星 座：射手\n" +
                "身 高：172CM\n" +
                "体 重：67KG\n" +
                "嗜 好：游泳\n" +
                "乐 器：吉他\n" +
                "喜爱的歌手：JIM MORRISON\n" +
                "喜爱的乐手：DAVE GILMOR\n" +
                "喜爱的演员：李立群\n" +
                "学 历：淡江大学\n" +
                "接触音乐历程：高中进入吉他社，组第一个团，参加热门音乐大赛\n" +
                "音乐经历：参加台湾音乐档案II、ㄞ国歌曲合辑、拥抱专辑制作\n" +
                "\n" +
                "贝 斯：玛莎\n" +
                "本 名：蔡升晏\n" +
                "英文名：Matthew Tsai\n" +
                "别 名：玛莎(Masa）\n" +
                "生 日：1977/4/25\n" +
                "生肖：蛇\n" +
                "出生地：高雄  \n" +
                "血 型：O型\n" +
                "星 座：金牛\n" +
                "身 高：172CM\n" +
                "体 重：66KG\n" +
                "乐 器：Bass、A.Guitar、一点Piano、口琴\n" +
                "喜爱的歌手：U2、Sting、罗纮武、李宗盛、Beatles、罗大佑\n" +
                "喜爱的乐手：Sting、Eric Clapton、Dave Grusin、艾拉妮丝LIVE的鼓手＆BASS、Sting Live的鼓手\n" +
                "学 历：辅仁大学社会系\n" +
                "接触音乐历程：小学学过二年钢琴高中开始学吉他，高二学bass并开始组团，当主唱，后来和阿信＆怪兽组团弹bass(SO BAND、MAYDAY )\n" +
                "音乐历程：ㄞ国歌曲合辑、拥抱专辑制作\n" +
                "\n");
    }
}
