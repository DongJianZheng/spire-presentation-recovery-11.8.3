/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjy;
import com.spire.presentation.packages.sprbwn;
import com.spire.presentation.packages.sprdym;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprrdn;
import com.spire.presentation.packages.sprtdn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprven;
import com.spire.presentation.packages.sprvzm;

@sprtea
public class sprygn {
    private sprven cfr_renamed_3;
    private long[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_11982(byte arg0) {
        sprygn sprygn2 = this;
        sprygn sprygn3 = this;
        sprygn2.cfr_renamed_4[0] = sprygn3.cfr_renamed_3.cfr_renamed_11983((int)(sprygn3.cfr_renamed_4[0] & 0xFFFFFFFFL), arg0);
        sprygn sprygn4 = this;
        sprygn2.cfr_renamed_4[1] = (sprygn4.cfr_renamed_4[1] & 0xFFFFFFFFL) + (long)((byte)(this.cfr_renamed_4[0] & 0xFFFFFFFFL) & 0xFF);
        sprygn4.cfr_renamed_4[1] = (this.cfr_renamed_4[1] & 0xFFFFFFFFL) * 134775813L + 1L;
        sprygn sprygn5 = this;
        sprygn2.cfr_renamed_4[2] = sprygn5.cfr_renamed_3.cfr_renamed_11983((int)(sprygn5.cfr_renamed_4[2] & 0xFFFFFFFFL), (byte)((this.cfr_renamed_4[1] & 0xFFFFFFFFL) >> 24));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 5 << 1;
        int cfr_ignored_0 = 5 << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public byte[] cfr_renamed_11984(byte[] arg0, int arg1) throws sprrdn {
        int n;
        if (arg0 == null) {
            throw new sprrdn(sprbjy.cfr_renamed_9("\u000e[#T\"Nm^(Y?C=Nc"), new IllegalArgumentException(sprbwn.cfr_renamed_9("_ly-qhsjie=ih\u007ftcz-Yh~\u007fd}idrc'-~dmex\u007fIhey=`h~i-\u007fh=crc0chaq#\u0010\u0007Mlolphiho-slph'-~dmex\u007fIhey")));
        }
        if (arg1 > arg0.length) {
            throw new sprrdn(sprbjy.cfr_renamed_9("\u000e[#T\"Nm^(Y?C=Nc"), new IllegalArgumentException(sprbwn.cfr_renamed_9("_ly-qhsjie=ih\u007ftcz-Yh~\u007fd}idrc'-iex-qhsjie=}|\u007f|`xyx\u007f=`h~i-\u007fh=~plqax\u007f=yuls-r\u007f=hlx|a=yr-iex-ndgh=b{-iex-yhnytc|ytbs-|\u007fold#\u0010\u0007Mlolphiho-slph'-qhsjie")));
        }
        byte[] byArray = new byte[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            sprygn sprygn2 = this;
            byte by = (byte)(arg0[n] & 0xFF ^ sprygn2.cfr_renamed_11985() & 0xFF);
            sprygn2.cfr_renamed_11982(by);
            byArray[n++] = by;
            n2 = n;
        }
        return byArray;
    }

    public byte[] cfr_renamed_11959(byte[] arg0, int arg1) throws sprrdn {
        int n;
        if (arg0 == null) {
            throw new sprrdn(sprbjy.cfr_renamed_9("\u000e[#T\"Nm_#Y?C=Nc"), new IllegalArgumentException(sprbwn.cfr_renamed_9("_ly-qhsjie=ih\u007ftcz-Xc~\u007fd}idrc'-iex-ma|dsYxui-pxny=ox-sbs sxqa3\u0000\u0017]|\u007f|`xyx\u007f=c|`x7=}qltcihey")));
        }
        if (arg1 > arg0.length) {
            throw new sprrdn(sprbjy.cfr_renamed_9("\u000e[#T\"Nm_#Y?C=Nc"), new IllegalArgumentException(sprbwn.cfr_renamed_9("_ly-qhsjie=ih\u007ftcz-Xc~\u007fd}idrc'-Iex-qhsjie=}|\u007f|`xyx\u007f=`h~i-\u007fh=~plqax\u007f=yuls-r\u007f=hlx|a=yr-iex-ndgh=b{-iex-yhnytc|ytbs-|\u007fold#\u0010\u0007Mlolphiho-slph'-qhsjie")));
        }
        byte[] byArray = new byte[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            byte by = arg0[n];
            int n3 = n++;
            byArray[n3] = (byte)(arg0[n3] & 0xFF ^ this.cfr_renamed_11985() & 0xFF);
            this.cfr_renamed_11982(by);
            n2 = n;
        }
        return byArray;
    }

    public static sprygn cfr_renamed_11956(String arg0) throws sprtdn {
        sprygn sprygn2 = new sprygn();
        if (arg0 == null) {
            throw new sprtdn(sprbjy.cfr_renamed_9("\u0019R$Im_#N?CmH(K8S?_>\u001a,\u001a=[>I:U?^c"));
        }
        sprygn sprygn3 = sprygn2;
        sprygn3.cfr_renamed_11986(arg0);
        return sprygn3;
    }

    private /* synthetic */ sprygn() {
        long[] lArray = new long[3];
        lArray[0] = 305419896L;
        lArray[1] = 591751049L;
        lArray[2] = 878082192L;
        this.cfr_renamed_4 = lArray;
        sprygn sprygn2 = this;
        this.cfr_renamed_3 = new sprven();
    }

    public void cfr_renamed_11986(String arg0) {
        int n;
        byte[] byArray = sprdym.cfr_renamed_11987(arg0);
        int n2 = n = 0;
        while (n2 < arg0.length()) {
            this.cfr_renamed_11982(byArray[n++]);
            n2 = n;
        }
    }

    public static sprygn cfr_renamed_11954(String arg0, sprvzm arg1) throws Exception {
        spreen spreen2 = arg1.cfr_renamed_1;
        byte[] byArray = arg1.cfr_renamed_805 = new byte[12];
        sprygn sprygn2 = new sprygn();
        if (arg0 == null) {
            throw new sprtdn(sprbwn.cfr_renamed_9("Yudn-xci\u007fd-ohlxt\u007fx~=l=}|~nzr\u007fy#"));
        }
        sprygn2.cfr_renamed_11986(arg0);
        sprvzm.cfr_renamed_11869(spreen2, byArray);
        byte[] byArray2 = sprygn2.cfr_renamed_11984(byArray, byArray.length);
        if (byArray2[11] != (byte)(arg1.cfr_renamed_119 >> 24 & 0xFF)) {
            if ((arg1.cfr_renamed_287 & 8) != 8) {
                throw new sprtdn(sprbjy.cfr_renamed_9("\u0019R(\u001a=[>I:U?^m^$^mT\"NmW,N.Rc"));
            }
            if (byArray2[11] != (byte)(arg1.cfr_renamed_1228 >> 8 & 0xFF)) {
                throw new sprtdn(sprbwn.cfr_renamed_9("Yuh=}|~nzr\u007fy-ydy-sbi-plinu#"));
            }
        }
        return sprygn2;
    }

    private /* synthetic */ byte cfr_renamed_11985() {
        int n = ((int)(this.cfr_renamed_4[2] & 0xFFFFFFFFL & 0xFFFFL) & 0xFFFF | 2) & 0xFFFF;
        return (byte)((n & 0xFFFF) * (n & 0xFFFF ^ 1) >> 8);
    }
}

