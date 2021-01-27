package ѡ���¼�;
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
        this.setTitle("2018��ѧԺ-רҵ-�༶��Ϣ");
        this.setSize(300,400);
        this.setLayout(null);
        college=new JComboBox();
        college.addItem("��ѡ��ѧԺ");
        college.addItem("������Ϣ���˹�����ѧԺ");
        college.addItem("��������ƹ���ѧԺ");
        college.addItem("���������ѧԺ");
        college.setSize(180,30);
        college.setLocation(30, 30);
        college.addItemListener(this);
        this.add(college);

        proName=new JComboBox();
        proName.addItem("��ѡ��רҵ����");
        proName.addItem("  ");
        proName.setSize(180,30);
        proName.setLocation(30, 80);
        this.add(proName);

        classes=new JComboBox();
        classes.addItem("��ѡ��רҵ�༶");
        classes.addItem("  ");
        classes.setSize(180,30);
        classes.setLocation(30, 130);
        this.add(classes);

        this.setVisible(true);
    }

    public void itemStateChanged(java.awt.event.ItemEvent e) {
        String temp = ((JComboBox) e.getSource()).getSelectedItem().toString();

        if (temp.equals("������Ϣ���˹�����ѧԺ")) {
            proName.removeItemListener(this);
            proName.removeAllItems();
            proName.addItemListener(this);
            String[] proNames ={"���繤��","�������ѧ�뼼��"};
            for (int i = 0; i < proNames.length; i++) {
                proName.addItem(proNames[i]);
            }
        }

        if (temp.equals("��������ƹ���ѧԺ")) {
            proName.removeItemListener(this);
            proName.removeAllItems();
            proName.addItemListener(this);
            String[] proNames = { "��������", "�Զ���"};
            for (int i = 0; i < proNames.length; i++) {
                proName.addItem(proNames[i]);
            }
        }

        if (temp.equals("���������ѧԺ")) {
            proName.removeItemListener(this);
            proName.removeAllItems();
            proName.addItemListener(this);
            String[] proNames ={"�г�Ӫ��","�������"};
            for (int i = 0; i < proNames.length; i++) {
                proName.addItem(proNames[i]);
            }
        }

        if (temp.equals("���繤��")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes1 = { "����181", "����182" };
            for (int i = 0; i < classes1.length; i++) {
                classes.addItem(classes1[i]);
            }
        }
        if (temp.equals("�������ѧ�뼼��")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes2 = { "�����181", "�����182", "�����183" };
            for (int i = 0; i <classes2.length; i++) {
                classes.addItem(classes2[i]);
            }
        }

        if (temp.equals("�г�Ӫ��")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes3 = { "�г�Ӫ��181", "�г�Ӫ��182" };
            for (int i = 0; i < classes3.length; i++) {
                classes.addItem(classes3[i]);
            }
        }
        if (temp.equals("�������")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes4 = { "�������181", "�������182" };
            for (int i = 0; i < classes4.length; i++) {
                classes.addItem(classes4[i]);
            }
        }
        if (temp.equals("��������")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes5 = { "����181", "����182" };
            for (int i = 0; i < classes5.length; i++) {
                classes.addItem(classes5[i]);
            }
        }
        if (temp.equals("�Զ���")) {
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItemListener(this);
            //classes.removeAllItems();
            String[] classes6 = { "�Զ���181", "�Զ���182" };
            for (int i = 0; i < classes6.length; i++) {
                classes.addItem(classes6[i]);
            }
        }


        if (temp.equals("��ѡ��ѧԺ")) {
            proName.removeItemListener(this);
            proName.removeAllItems();
            proName.addItem("��ѡ��רҵ����");
            classes.removeItemListener(this);
            classes.removeAllItems();
            classes.addItem("��ѡ��רҵ�༶");
        }

    }
}
