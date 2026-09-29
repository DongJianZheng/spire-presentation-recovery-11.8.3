/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprclg;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprigp;
import com.spire.presentation.packages.sprmjp;
import com.spire.presentation.packages.sprnsp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprquq;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import java.util.ArrayList;

@sprtea
public class sprnbp {
    private sprmjp cfr_renamed_1;
    private static String[] cfr_renamed_2;
    private static String[] cfr_renamed_3;
    private static String[] cfr_renamed_4;

    public sprfzo cfr_renamed_19006(String arg0, int arg1, sprigp arg2) {
        String[] stringArray = (String[])this.cfr_renamed_1.cfr_renamed_1600(arg0);
        if (stringArray != null) {
            int n;
            String[] stringArray2 = stringArray;
            int n2 = stringArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                String string = stringArray2[n];
                sprfzo sprfzo2 = arg2.cfr_renamed_16792(string, arg1);
                if (sprfzo2 != null) {
                    sprfzo sprfzo3 = sprfzo2;
                    sprfzo3.cfr_renamed_18549(true);
                    return sprfzo3;
                }
                n3 = ++n;
            }
        }
        return null;
    }

    public void cfr_renamed_19007(String arg0, String ... arg1) {
        if (arg1 == null || arg1.length == 0) {
            return;
        }
        String[] stringArray = (String[])this.cfr_renamed_1.cfr_renamed_1600(arg0);
        if (stringArray == null || stringArray.length == 0) {
            this.cfr_renamed_1.cfr_renamed_14943(arg0, arg1);
            return;
        }
        this.cfr_renamed_1.cfr_renamed_14943(arg0, sprnbp.cfr_renamed_19008(stringArray, arg1));
    }

    static {
        String[] stringArray = new String[3];
        stringArray[0] = "FreeSerif";
        stringArray[1] = sprquq.cfr_renamed_9("Pr~~nzhrsu<Hyiu}");
        stringArray[2] = sprclg.cfr_renamed_9("2,\u001c( <V\u001a\u0013;\u001f/");
        cfr_renamed_4 = stringArray;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Garuda";
        stringArray2[1] = sprquq.cfr_renamed_9("Ziy~Ozrh");
        stringArray2[2] = sprclg.cfr_renamed_9("\u0005\u001f+\u0013;\u0017=\u001f&\u0018i%(\u0018:");
        stringArray2[3] = sprquq.cfr_renamed_9("_yq}Mi;Ozrh");
        cfr_renamed_2 = stringArray2;
        String[] stringArray3 = new String[3];
        stringArray3[0] = "FreeMono";
        stringArray3[1] = sprclg.cfr_renamed_9("\u0005\u001f+\u0013;\u0017=\u001f&\u0018i;&\u0018&");
        stringArray3[2] = sprquq.cfr_renamed_9("X~vzJn<H}uo;Qtrt");
        cfr_renamed_3 = stringArray3;
    }

    public sprnbp() {
        sprnbp sprnbp2 = this;
        sprnbp2.cfr_renamed_1 = new sprmjp(false);
        if (sprnsp.cfr_renamed_19009()) {
            sprnbp sprnbp3 = this;
            sprnbp3.cfr_renamed_19007("Arial", cfr_renamed_2);
            String[] stringArray = new String[1];
            stringArray[0] = "FreeSerif";
            sprnbp3.cfr_renamed_19007(sprclg.cfr_renamed_9("5!\u0017;\u0015&\u0017%"), stringArray);
            String[] stringArray2 = new String[1];
            stringArray2[0] = sprclg.cfr_renamed_9("\r\u0013#\u0017\u001f\u0003i%(\u0018:");
            this.cfr_renamed_19007(sprquq.cfr_renamed_9("Xsvux<H}uo;QH"), stringArray2);
            sprnbp sprnbp4 = this;
            sprnbp4.cfr_renamed_19007(sprquq.cfr_renamed_9("Xsnnryi<Uyl"), cfr_renamed_3);
            String[] stringArray3 = new String[1];
            stringArray3[0] = sprquq.cfr_renamed_9("Rtnzor");
            sprnbp4.cfr_renamed_19007(sprclg.cfr_renamed_9("\u000e\u0013&\u0004.\u001f("), stringArray3);
            String[] stringArray4 = new String[1];
            stringArray4[0] = sprquq.cfr_renamed_9("Ziy~Ozrh");
            this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u0001\u0013%\u0000,\u0002 \u0015("), stringArray4);
            String[] stringArray5 = new String[1];
            stringArray5[0] = "Garuda";
            this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u0005\u0003*\u001f-\u0017i1;\u0017'\u0012,"), stringArray5);
            String[] stringArray6 = new String[1];
            stringArray6[0] = "Garuda";
            this.cfr_renamed_19007(sprquq.cfr_renamed_9("Wixu\u007f};Ozrh<Nrr\u007ftx~"), stringArray6);
            String[] stringArray7 = new String[1];
            stringArray7[0] = "Garuda";
            this.cfr_renamed_19007(sprclg.cfr_renamed_9(":<\u0015 \u0012(V\n\u0019'\u0005&\u001a,"), stringArray7);
            String[] stringArray8 = new String[1];
            stringArray8[0] = sprclg.cfr_renamed_9("2,\u001c( <V\u001a\u0013;\u001f/");
            this.cfr_renamed_19007(sprquq.cfr_renamed_9("R~k;Etnp"), stringArray8);
            String[] stringArray9 = new String[1];
            stringArray9[0] = sprclg.cfr_renamed_9("=(\u001a \u001b(\u0002 ");
            this.cfr_renamed_19007(sprquq.cfr_renamed_9("Hzttqz"), stringArray9);
            sprnbp sprnbp5 = this;
            sprnbp5.cfr_renamed_19007("Times New Roman", cfr_renamed_4);
            String[] stringArray10 = new String[1];
            stringArray10[0] = "FreeSerif";
            sprnbp5.cfr_renamed_19007(sprquq.cfr_renamed_9("K}w}ouus;Prrthbl~"), stringArray10);
            String[] stringArray11 = new String[1];
            stringArray11[0] = sprquq.cfr_renamed_9("X~vzJn<H}uo;Qtrt");
            this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u001f\u0013;\u0012(\u0018("), stringArray11);
            String[] stringArray12 = new String[1];
            stringArray12[0] = "Garuda";
            this.cfr_renamed_19007(sprclg.cfr_renamed_9("\";\u0013+\u0003*\u001e,\u0002i;\u001a"), stringArray12);
            String[] stringArray13 = new String[1];
            stringArray13[0] = sprclg.cfr_renamed_9("\u001b\u0013\"\u001e(");
            this.cfr_renamed_19007(sprquq.cfr_renamed_9("Uvlz\u007fo"), stringArray13);
            String[] stringArray14 = new String[1];
            stringArray14[0] = sprclg.cfr_renamed_9("=(\u0015:\u0002\b\u0004=");
            this.cfr_renamed_19007(sprquq.cfr_renamed_9("]i}yux<Onzrhlzn~ro"), stringArray14);
            sprnbp sprnbp6 = this;
            sprnbp sprnbp7 = this;
            sprnbp sprnbp8 = this;
            sprnbp sprnbp9 = this;
            sprnbp sprnbp10 = this;
            sprnbp sprnbp11 = this;
            sprnbp11.cfr_renamed_19007(sprquq.cfr_renamed_9("]iuzp;^zpoux"), cfr_renamed_2);
            sprnbp11.cfr_renamed_19007(sprclg.cfr_renamed_9("7;\u001f(\u001ai5\f"), cfr_renamed_2);
            sprnbp10.cfr_renamed_19007(sprquq.cfr_renamed_9("Znr}w<Xei"), cfr_renamed_2);
            sprnbp10.cfr_renamed_19007(sprclg.cfr_renamed_9("\b\u0004 \u0017%V\u000e\u0004,\u0013\""), cfr_renamed_2);
            sprnbp9.cfr_renamed_19007(sprquq.cfr_renamed_9("Znr}w<OII"), cfr_renamed_2);
            sprnbp9.cfr_renamed_19007(sprclg.cfr_renamed_9("5&\u0003;\u001f,\u0004i8,\u0001i4(\u001a=\u001f*"), cfr_renamed_3);
            sprnbp8.cfr_renamed_19007(sprquq.cfr_renamed_9("_tiiu~n;R~k;_^"), cfr_renamed_3);
            sprnbp8.cfr_renamed_19007(sprclg.cfr_renamed_9("\n\u0019<\u0004 \u0013;V\u0007\u0013>V\n\u000f;"), cfr_renamed_3);
            sprnbp7.cfr_renamed_19007(sprquq.cfr_renamed_9("Xsnnryi<Uyl<\\n~yp"), cfr_renamed_3);
            sprnbp7.cfr_renamed_19007(sprclg.cfr_renamed_9("\n\u0019<\u0004 \u0013;V\u0007\u0013>V\u001d#\u001b"), cfr_renamed_3);
            sprnbp6.cfr_renamed_19007("Courier", cfr_renamed_3);
            String[] stringArray15 = new String[1];
            stringArray15[0] = "Garuda";
            sprnbp6.cfr_renamed_19007(sprquq.cfr_renamed_9("O}ssv};]iq~rr}u"), stringArray15);
            sprnbp sprnbp12 = this;
            sprnbp sprnbp13 = this;
            sprnbp sprnbp14 = this;
            this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u001d\u001f$\u0013:"), cfr_renamed_4);
            sprnbp14.cfr_renamed_19007(sprquq.cfr_renamed_9("Hrq~o;R~k;Ntqzr;^zpoux"), cfr_renamed_4);
            sprnbp14.cfr_renamed_19007(sprclg.cfr_renamed_9("\" \u001b,\u0005i8,\u0001i$&\u001b(\u0018i5\f"), cfr_renamed_4);
            sprnbp13.cfr_renamed_19007(sprquq.cfr_renamed_9("Ouvyh<Uyl<Isv}u<Xei"), cfr_renamed_4);
            sprnbp13.cfr_renamed_19007(sprclg.cfr_renamed_9("\u001d\u001f$\u0013:V\u0007\u0013>V\u001b\u0019$\u0017'V\u000e\u0004,\u0013\""), cfr_renamed_4);
            sprnbp12.cfr_renamed_19007(sprquq.cfr_renamed_9("Ouvyh<Uyl<Isv}u<OII"), cfr_renamed_4);
            String[] stringArray16 = new String[1];
            stringArray16[0] = sprclg.cfr_renamed_9("\r\u0013#\u0017\u001f\u0003i%(\u0018:");
            sprnbp12.cfr_renamed_19007("Microsoft Sans Serif", stringArray16);
            String[] stringArray17 = new String[1];
            stringArray17[0] = "TakaoPGothic";
            this.cfr_renamed_19007(sprquq.cfr_renamed_9("QH<NU;[thsux"), stringArray17);
            String[] stringArray18 = new String[1];
            stringArray18[0] = "FreeSerif";
            this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u0019; \u0018.: #d31\u0002\u000b"), stringArray18);
            String[] stringArray19 = new String[1];
            stringArray19[0] = sprquq.cfr_renamed_9("Ziy~O~nrz;Uo}wux");
            this.cfr_renamed_19007("Cambria Math", stringArray19);
            String[] stringArray20 = new String[1];
            stringArray20[0] = sprquq.cfr_renamed_9("Wuyyi}outr;Ozrh");
            this.cfr_renamed_19007(sprclg.cfr_renamed_9("\n\u0017%\u001f+\u0004 "), stringArray20);
            String[] stringArray21 = new String[1];
            stringArray21[0] = "TakaoPGothic";
            this.cfr_renamed_19007("MS PGothic", stringArray21);
            String[] stringArray22 = new String[1];
            stringArray22[0] = "TakaoPGothic";
            this.cfr_renamed_19007("Arial Unicode MS", stringArray22);
            String[] stringArray23 = new String[1];
            stringArray23[0] = sprquq.cfr_renamed_9("QHiu{\\^*$+/+_6Q~xriv");
            this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u0004\u001f*\u0004&\u0005&\u0010=V\u0010\u0017\u0001\u0013 "), stringArray23);
            return;
        }
        String[] stringArray = new String[1];
        stringArray[0] = "Arial";
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("7;\u0017+\u001f*V\u001d\u0004(\u0018:\u0006(\u0004,\u0018="), stringArray);
        String[] stringArray24 = new String[1];
        stringArray24[0] = "Arial";
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("]iuzp;^zpoux"), stringArray24);
        String[] stringArray25 = new String[1];
        stringArray25[0] = "Arial";
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("7;\u001f(\u001ai5\f"), stringArray25);
        String[] stringArray26 = new String[1];
        stringArray26[0] = "Arial";
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Znr}w<Xei"), stringArray26);
        String[] stringArray27 = new String[1];
        stringArray27[0] = "Arial";
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\b\u0004 \u0017%V\u000e\u0004,\u0013\""), stringArray27);
        String[] stringArray28 = new String[1];
        stringArray28[0] = "Arial";
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Znr}w<OII"), stringArray28);
        String[] stringArray29 = new String[1];
        stringArray29[0] = "Arial";
        this.cfr_renamed_19007("TakaoPGothic", stringArray29);
        String[] stringArray30 = new String[1];
        stringArray30[0] = "Arial";
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u001c\u0018 \u0000,\u0004:"), stringArray30);
        String[] stringArray31 = new String[1];
        stringArray31[0] = sprclg.cfr_renamed_9("\n\u0019<\u0004 \u0013;V\u0007\u0013>");
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("_tiiu~n;R~k;^zpoux"), stringArray31);
        String[] stringArray32 = new String[1];
        stringArray32[0] = sprclg.cfr_renamed_9("\n\u0019<\u0004 \u0013;V\u0007\u0013>");
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("_tiiu~n;R~k;_^"), stringArray32);
        String[] stringArray33 = new String[1];
        stringArray33[0] = sprclg.cfr_renamed_9("\n\u0019<\u0004 \u0013;V\u0007\u0013>");
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Xsnnryi<Uyl<Xei"), stringArray33);
        String[] stringArray34 = new String[1];
        stringArray34[0] = sprclg.cfr_renamed_9("\n\u0019<\u0004 \u0013;V\u0007\u0013>");
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Xsnnryi<Uyl<\\n~yp"), stringArray34);
        String[] stringArray35 = new String[1];
        stringArray35[0] = sprclg.cfr_renamed_9("\n\u0019<\u0004 \u0013;V\u0007\u0013>");
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Xsnnryi<Uyl<OII"), stringArray35);
        String[] stringArray36 = new String[1];
        stringArray36[0] = sprquq.cfr_renamed_9("Xsnnryi<Uyl");
        this.cfr_renamed_19007("Courier", stringArray36);
        String[] stringArray37 = new String[1];
        stringArray37[0] = sprquq.cfr_renamed_9("_}mu\u007f");
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\r\u0017?\u001f-V\u001d\u0004(\u0018:\u0006(\u0004,\u0018="), stringArray37);
        String[] stringArray38 = new String[1];
        stringArray38[0] = sprquq.cfr_renamed_9("Zzr|Otr|");
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u000f\u0017'\u0011\u001a\u0019'\u0011\u00161\u000bDzG{"), stringArray38);
        String[] stringArray39 = new String[1];
        stringArray39[0] = sprquq.cfr_renamed_9("Zzr|Otr|");
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u4eb6\u5bfd\u00161\u000bDzG{"), stringArray39);
        String[] stringArray40 = new String[1];
        stringArray40[0] = sprquq.cfr_renamed_9("Qrnr}v<]ucy\u007f");
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("0 \u000e,\u0012i; \u0004 \u0017$V\u001d\u0004(\u0018:\u0006(\u0004,\u0018="), stringArray40);
        String[] stringArray41 = new String[1];
        stringArray41[0] = "Arial";
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u0001\u0013%\u0000,\u0002 \u0015("), stringArray41);
        String[] stringArray42 = new String[1];
        stringArray42[0] = sprclg.cfr_renamed_9("\u0002\u0017 \" ");
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("WzuOuD[Y.(-)"), stringArray42);
        String[] stringArray43 = new String[1];
        stringArray43[0] = sprclg.cfr_renamed_9("\u0002\u0017 \" ");
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("\u696c\u4f4fD[Y.(-)"), stringArray43);
        String[] stringArray44 = new String[1];
        stringArray44[0] = sprclg.cfr_renamed_9("; \u0004 \u0017$");
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Qrnr}v<Onzrhlzn~ro"), stringArray44);
        String[] stringArray45 = new String[1];
        stringArray45[0] = "Microsoft Sans Serif";
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("QH<Ht~pw<_p|"), stringArray45);
        String[] stringArray46 = new String[1];
        stringArray46[0] = sprquq.cfr_renamed_9("Hzttqz");
        this.cfr_renamed_19007(sprclg.cfr_renamed_9(";\u001aV\u001a\u001e,\u001a%V\r\u001a.V{"), stringArray46);
        String[] stringArray47 = new String[1];
        stringArray47[0] = sprquq.cfr_renamed_9("Is\u007f");
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u001b\u0019-V\u001d\u0004(\u0018:\u0006(\u0004,\u0018="), stringArray47);
        String[] stringArray48 = new String[1];
        stringArray48[0] = sprquq.cfr_renamed_9("Hzttqz");
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u001d\u0017!\u0019$\u0017i7;\u001b,\u0018 \u0017'"), stringArray48);
        String[] stringArray49 = new String[1];
        stringArray49[0] = "Times New Roman";
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u001d\u001f$\u0013:"), stringArray49);
        String[] stringArray50 = new String[1];
        stringArray50[0] = "Times New Roman";
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Hrq~o;R~k;Ntqzr;^zpoux"), stringArray50);
        String[] stringArray51 = new String[1];
        stringArray51[0] = "Times New Roman";
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\" \u001b,\u0005i8,\u0001i$&\u001b(\u0018i5\f"), stringArray51);
        String[] stringArray52 = new String[1];
        stringArray52[0] = "Times New Roman";
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Ouvyh<Uyl<Isv}u<Xei"), stringArray52);
        String[] stringArray53 = new String[1];
        stringArray53[0] = "Times New Roman";
        this.cfr_renamed_19007(sprclg.cfr_renamed_9("\u001d\u001f$\u0013:V\u0007\u0013>V\u001b\u0019$\u0017'V\u000e\u0004,\u0013\""), stringArray53);
        String[] stringArray54 = new String[1];
        stringArray54[0] = "Times New Roman";
        this.cfr_renamed_19007(sprquq.cfr_renamed_9("Ouvyh<Uyl<Isv}u<OII"), stringArray54);
    }

    public String[] cfr_renamed_19010(String arg0) {
        return (String[])this.cfr_renamed_1.cfr_renamed_1600(arg0);
    }

    private static /* synthetic */ String[] cfr_renamed_19008(String[] arg0, String[] arg1) {
        String string;
        int n;
        sprwvn sprwvn2 = new sprwvn(arg0.length + arg1.length);
        String[] stringArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            string = stringArray[n];
            if (!sprwvn2.contains(string)) {
                sprovja.cfr_renamed_11658(sprwvn2, string);
            }
            n3 = ++n;
        }
        stringArray = arg1;
        n2 = arg1.length;
        int n4 = n = 0;
        while (n4 < n2) {
            string = stringArray[n];
            if (!sprwvn2.contains(string)) {
                sprovja.cfr_renamed_11658(sprwvn2, string);
            }
            n4 = ++n;
        }
        return (String[])sprovja.cfr_renamed_13436((ArrayList)sprwvn.cfr_renamed_13437(sprwvn2), String.class);
    }

    public void cfr_renamed_19011(String arg0, String ... arg1) {
        if (arg1 == null || arg1.length == 0) {
            this.cfr_renamed_1.cfr_renamed_2437(arg0);
        }
        this.cfr_renamed_1.cfr_renamed_14943(arg0, arg1);
    }
}

