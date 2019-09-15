package com.harry.design.pattern.structural.composite;

/**
 * Sunny软件公司欲开发一个杀毒(AntiVirus)软件，该软件既可以对某个文件夹(Folder)杀毒，
 * 也可以对某个指定的文件(File)进行杀毒。该杀毒软件还可以根据各类文件的特点，为不同类型的文件提供不同的杀毒方式，
 * 例如图像文件(ImageFile)和文本文件(TextFile)的杀毒方式就有所差异。现需要提供该杀毒软件的整体框架设计方案。
 * create by： harry
 * date:  2019/8/4 0004
 **/
public class Test {

    public static void main(String[] args) {
        AbstractFile folder1, folder2, folder3, folder4;
        AbstractFile file1, file2, file3, file4;

        folder1 = new Folder();
        ((Folder) folder1).setName("图片文件夹");

        folder2 = new Folder();
        ((Folder) folder2).setName("办公文件夹");

        folder3 = new Folder();
        ((Folder) folder3).setName("笔记文件夹");

        folder4 = new Folder();
        ((Folder) folder4).setName("隐藏文件夹");

        file1 = new ImageFile();
        ((ImageFile) file1).setName("企业logo.png");
        file2 = new OfficeFile();
        ((OfficeFile) file2).setName("企业规划说明书.docx");
        file3 = new TxtFile();
        ((TxtFile) file3).setName("俺的备忘录.txt");

        folder4.add(folder1);
        folder4.add(folder2);
        folder4.add(folder3);

        folder1.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder4.killVirus();

        file1.add(file2);

    }
}
