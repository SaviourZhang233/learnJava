package 选项事件;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEvents extends JFrame implements ItemListener
{
    JComboBox college;
    JComboBox proName;
    JComboBox classes;

    public ItemEvents()
    {
        this.setTitle("2018级学院-专业-班级信息");
        this.setSize(300,400);
        this.setLayout(null);
        college=new JComboBox();
        college.addItem("请选择学院");
        college.addItem("电子信息与人工智能学院");
        college.addItem("电气与控制工程学院");
        college.addItem("经济与管理学院");
        college.setSize(180,30);
        college.setLocation(30, 30);
        college.addItemListener(this);
        this.add(college);

        proName=new JComboBox();
        proName.addItem("请选择专业名称");
        proName.addItem("  ");
        proName.setSize(180,30);
        proName.setLocation(30, 80);
        this.add(proName);

        classes=new JComboBox();
        classes.addItem("请选择专业班级");
        classes.addItem("  ");
        classes.setSize(180,30);
        classes.setLocation(30, 130);
        this.add(classes);

        this.setVisible(true);
    }

    public void itemStateChanged(java.awt.event.ItemEvent e) {
        String temp = ((JComboBox) e.getSource()).getSelectedItem().toString();

        if (temp.equals("电子信息与人工智能学院")) {
            proName.removeItemListener(this);
            proName.removeAllItems();
            proName.addItemListener(this);
            String[] proNames ={"网络工程","计算机科学与技术"};
            for (int i = 0; i < proNames.length; i++) {
                proName.addItem(proNames[i]);
            }
        }

        if (temp.equals("电气与控制工程学院")) {
            proName.removeItemListener(this);
            proName.removeAllItems();
            proName.addItemListener(this);
            String[] proNames = { "电气工程", "自动化"};
            for (int i = 0; i < proNames.length; i++) {
                proName.addItem(proNames[i]);
            }
        }

        if (temp.equals("经济与管理学院")) {
            proName.removeItemListener(this);
            proName.removeAllItems();
            proName.addItemListener(this);
            String[] proNames ={"市场营销","财务管理"};
            for (int i = 0; i < proNames.length; i++) {
                proName.addItem(proNames[i]);
            }
        }

        if (temp.equals("网络工程")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes1 = { "网络181", "网络182" };
            for (int i = 0; i < classes1.length; i++) {
                classes.addItem(classes1[i]);
            }
        }
        if (temp.equals("计算机科学与技术")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes2 = { "计算机181", "计算机182", "计算机183" };
            for (int i = 0; i <classes2.length; i++) {
                classes.addItem(classes2[i]);
            }
        }

        if (temp.equals("市场营销")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes3 = { "市场营销181", "市场营销182" };
            for (int i = 0; i < classes3.length; i++) {
                classes.addItem(classes3[i]);
            }
        }
        if (temp.equals("财务管理")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes4 = { "财务管理181", "财务管理182" };
            for (int i = 0; i < classes4.length; i++) {
                classes.addItem(classes4[i]);
            }
        }
        if (temp.equals("电气工程")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes5 = { "电气181", "电气182" };
            for (int i = 0; i < classes5.length; i++) {
                classes.addItem(classes5[i]);
            }
        }
        if (temp.equals("自动化")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes6 = { "自动化181", "自动化182" };
            for (int i = 0; i < classes6.length; i++) {
                classes.addItem(classes6[i]);
            }
        }


        if (temp.equals("请选择学院")) {
            proName.removeItemListener(this);
            proName.removeAllItems();
            proName.addItem("请选择专业名称");
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItem("请选择专业班级");
        }

    }
}
