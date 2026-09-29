/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.spreah;
import com.spire.presentation.packages.spreg;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhzg;
import com.spire.presentation.packages.sprid;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmhm;
import com.spire.presentation.packages.sprnvg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnl;
import com.spire.presentation.packages.sprqbm;
import com.spire.presentation.packages.sprqj;
import com.spire.presentation.packages.sprqrda;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprxcm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class sprzyg {
    private volatile OutputStream cfr_renamed_272;
    public static final int cfr_renamed_145 = 17;
    private volatile byte cfr_renamed_114;
    private volatile spreg cfr_renamed_96;
    public static final int cfr_renamed_105 = 18;
    public static final int cfr_renamed_137 = 32;
    private final int cfr_renamed_79;
    public static final int cfr_renamed_107 = 24;
    public static final int cfr_renamed_132 = 2;
    public static final int cfr_renamed_102 = 0;
    public static final int cfr_renamed_93 = 64;
    public static final int cfr_renamed_86 = 16;
    public static final int cfr_renamed_152 = 1;
    public static final int cfr_renamed_112 = 25;
    public static final int cfr_renamed_119 = 40;
    public static final int cfr_renamed_91 = 48;
    public static final int cfr_renamed_0 = 80;
    private final sprmhm cfr_renamed_1;
    public static final int cfr_renamed_2 = 31;
    public static final int cfr_renamed_3 = 19;
    private final sprxcm cfr_renamed_4;

    public boolean cfr_renamed_7673(sprvbh arg0, sprvbh arg1) throws sprtqg {
        sprzyg sprzyg2 = this;
        sprzyg sprzyg3 = this;
        sprzyg3.cfr_renamed_7663(arg0);
        sprzyg2.cfr_renamed_7663(arg1);
        sprzyg3.cfr_renamed_7674();
        return sprzyg2.cfr_renamed_96.cfr_renamed_1435(this.cfr_renamed_79());
    }

    public sprzyg(sprmam arg0) throws IOException, sprtqg {
        this(sprzyg.cfr_renamed_7675(arg0.cfr_renamed_7676()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7537(byte arg0) {
        try {
            this.cfr_renamed_272.write(arg0);
            return;
        }
        catch (IOException iOException) {
            throw new spreah(iOException.getMessage(), iOException);
        }
    }

    public void cfr_renamed_1310(OutputStream arg0, boolean arg1) throws IOException {
        if (!(!arg1 || this.cfr_renamed_7677().cfr_renamed_7615() && this.cfr_renamed_7678().cfr_renamed_7615())) {
            return;
        }
        sprjah sprjah2 = sprjah.cfr_renamed_7679(arg0);
        sprjah2.cfr_renamed_7680(this.cfr_renamed_4);
        if (!arg1 && this.cfr_renamed_1 != null) {
            sprjah2.cfr_renamed_7680(this.cfr_renamed_1);
        }
    }

    public int cfr_renamed_579() {
        return this.cfr_renamed_4.cfr_renamed_579();
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3();
    }

    public boolean cfr_renamed_7681(byte[] arg0, sprvbh arg1) throws sprtqg {
        if (this.cfr_renamed_96 == null) {
            throw new sprtqg(spreah.cfr_renamed_9("\f0\f$5\u00102\u0016(\u0002.\u0012|\u00193\u0003|\u001e2\u001e(\u001e=\u001b5\u00049\u0013|Z|\u0014=\u001b0W5\u00195\u0003t^r"));
        }
        if (!sprzyg.cfr_renamed_7580(this.cfr_renamed_79) && 48 != this.cfr_renamed_79) {
            throw new sprtqg(sprqrda.cfr_renamed_9("`7t0r*f,v~z-30v7g6v,3?3=v,g7u7p?g7|03-z9}?g+a;30|,3?3=v,g7u7p?g7|03,v(|=r*z1}p"));
        }
        return this.cfr_renamed_7682(arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_7663(sprvbh arg0) throws sprtqg {
        sprzyg sprzyg2 = this;
        byte[] byArray = sprzyg2.cfr_renamed_7660(arg0);
        sprzyg2.cfr_renamed_1221((byte)-103);
        sprzyg2.cfr_renamed_1221((byte)(byArray.length >> 8));
        this.cfr_renamed_1221((byte)byArray.length);
        this.cfr_renamed_1196(byArray);
    }

    public boolean cfr_renamed_7683(sprvbh arg0) throws sprtqg {
        sprzyg sprzyg2 = this;
        sprzyg2.cfr_renamed_7663(arg0);
        sprzyg2.cfr_renamed_7674();
        return sprzyg2.cfr_renamed_96.cfr_renamed_1435(this.cfr_renamed_79());
    }

    public sprzyg(sprxcm arg0) {
        this(arg0, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7674() {
        try {
            sprzyg sprzyg2 = this;
            sprzyg2.cfr_renamed_272.write(sprzyg2.cfr_renamed_4.cfr_renamed_7684());
            sprzyg2.cfr_renamed_272.close();
            return;
        }
        catch (IOException iOException) {
            throw new spreah(iOException.getMessage(), iOException);
        }
    }

    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public sprid cfr_renamed_7587(sprqj arg0) throws sprtqg {
        return arg0.cfr_renamed_2658(this.cfr_renamed_4.cfr_renamed_2373(), this.cfr_renamed_4.cfr_renamed_579());
    }

    /*
     * WARNING - void declaration
     */
    public sprzyg(sprzyg sprzyg2) {
        void arg0;
        sprzyg sprzyg3 = this;
        void v1 = arg0;
        this.cfr_renamed_4 = v1.cfr_renamed_4;
        sprzyg3.cfr_renamed_79 = v1.cfr_renamed_79;
        sprzyg3.cfr_renamed_1 = sprzyg2.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1626() throws sprtqg {
        try {
            sprzyg sprzyg2 = this;
            sprzyg2.cfr_renamed_272.write(this.cfr_renamed_7684());
            sprzyg2.cfr_renamed_272.close();
            return this.cfr_renamed_96.cfr_renamed_1435(this.cfr_renamed_79());
        }
        catch (IOException iOException) {
            throw new sprtqg(iOException.getMessage(), iOException);
        }
    }

    public boolean cfr_renamed_7685() {
        return this.cfr_renamed_4.cfr_renamed_7677() != null || this.cfr_renamed_4.cfr_renamed_7678() != null;
    }

    public byte[] cfr_renamed_79() throws sprtqg {
        sprghm[] sprghmArray = this.cfr_renamed_4.cfr_renamed_79();
        if (sprghmArray != null) {
            if (sprghmArray.length == 1) {
                byte[] byArray = sprhdf.cfr_renamed_514(sprghmArray[0].cfr_renamed_97());
                return byArray;
            }
            if (this.cfr_renamed_2373() == 22) {
                byte[] byArray = new byte[64];
                byte[] byArray2 = sprhdf.cfr_renamed_514(sprghmArray[0].cfr_renamed_97());
                byte[] byArray3 = sprhdf.cfr_renamed_514(sprghmArray[1].cfr_renamed_97());
                System.arraycopy(byArray2, 0, byArray, 32 - byArray2.length, byArray2.length);
                System.arraycopy(byArray3, 0, byArray, 64 - byArray3.length, byArray3.length);
                return byArray;
            }
            try {
                sprrvm sprrvm2;
                sprrvm sprrvm3 = sprrvm2 = new sprrvm();
                sprrvm3.cfr_renamed_5004(new sprktm(sprghmArray[0].cfr_renamed_97()));
                sprrvm3.cfr_renamed_5004(new sprktm(sprghmArray[1].cfr_renamed_97()));
                byte[] byArray = new sprcen(sprrvm2).cfr_renamed_91();
                return byArray;
            }
            catch (IOException iOException) {
                throw new sprtqg(spreah.cfr_renamed_9("9\u000f?\u0012,\u00035\u00182W9\u0019?\u00188\u001e2\u0010|3\u000f6|\u00045\u0010r"), iOException);
            }
        }
        byte[] byArray = this.cfr_renamed_4.cfr_renamed_7686();
        return byArray;
    }

    public int cfr_renamed_7576() {
        return this.cfr_renamed_4.cfr_renamed_7576();
    }

    public boolean cfr_renamed_7687(sprvbh arg0) throws sprtqg {
        if (this.cfr_renamed_96 == null) {
            throw new sprtqg(sprqrda.cfr_renamed_9("\u000eT\u000e@7t0r*f,v~}1g~z0z*z?\u007f7`;w~>~p?\u007f237}7gv:p"));
        }
        if (this.cfr_renamed_7576() != 32 && this.cfr_renamed_7576() != 31) {
            throw new sprtqg(spreah.cfr_renamed_9("\u00045\u00102\u0016(\u0002.\u0012|\u001e/W2\u0018(W=W7\u0012%W/\u001e;\u0019=\u0003)\u00059"));
        }
        return this.cfr_renamed_7683(arg0);
    }

    public boolean cfr_renamed_7688() {
        return sprzyg.cfr_renamed_7580(this.cfr_renamed_7576());
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        this.cfr_renamed_1310(arg0, false);
    }

    private static /* synthetic */ sprxcm cfr_renamed_7675(sprtzl arg0) throws IOException {
        if (!(arg0 instanceof sprxcm)) {
            throw new IOException(new StringBuilder().insert(0, sprqrda.cfr_renamed_9("+};k.v=g;w~c?p5v*37}~`*a;r3)~")).append(arg0).toString());
        }
        return (sprxcm)arg0;
    }

    public byte[] cfr_renamed_7689() {
        return this.cfr_renamed_4.cfr_renamed_7690();
    }

    public boolean cfr_renamed_7691(sprnvg arg0, sprvbh arg1) throws sprtqg {
        if (this.cfr_renamed_96 == null) {
            throw new sprtqg(spreah.cfr_renamed_9("\f0\f$5\u00102\u0016(\u0002.\u0012|\u00193\u0003|\u001e2\u001e(\u001e=\u001b5\u00049\u0013|Z|\u0014=\u001b0W5\u00195\u0003t^r"));
        }
        if (!sprzyg.cfr_renamed_7580(this.cfr_renamed_79) && 48 != this.cfr_renamed_79) {
            throw new sprtqg(sprqrda.cfr_renamed_9("`7t0r*f,v~z-30v7g6v,3?3=v,g7u7p?g7|03-z9}?g+a;30|,3?3=v,g7u7p?g7|03,v(|=r*z1}p"));
        }
        return this.cfr_renamed_7692(arg0, arg1);
    }

    public byte[] cfr_renamed_7684() {
        return this.cfr_renamed_4.cfr_renamed_7684();
    }

    public sprhzg cfr_renamed_7678() {
        sprzyg sprzyg2 = this;
        return sprzyg2.cfr_renamed_7693(sprzyg2.cfr_renamed_4.cfr_renamed_7678());
    }

    public void cfr_renamed_1221(byte arg0) {
        block0: {
            block2: {
                sprzyg sprzyg2;
                block4: {
                    block3: {
                        block1: {
                            if (this.cfr_renamed_79 != 1) break block0;
                            if (arg0 != 13) break block1;
                            sprzyg sprzyg3 = this;
                            sprzyg2 = sprzyg3;
                            sprzyg3.cfr_renamed_7537((byte)13);
                            sprzyg3.cfr_renamed_7537((byte)10);
                            break block2;
                        }
                        if (arg0 != 10) break block3;
                        if (this.cfr_renamed_114 == 13) break block4;
                        sprzyg sprzyg4 = this;
                        sprzyg2 = sprzyg4;
                        sprzyg4.cfr_renamed_7537((byte)13);
                        sprzyg4.cfr_renamed_7537((byte)10);
                        break block2;
                    }
                    this.cfr_renamed_7537(arg0);
                }
                sprzyg2 = this;
            }
            sprzyg2.cfr_renamed_114 = arg0;
            return;
        }
        this.cfr_renamed_7537(arg0);
    }

    private /* synthetic */ sprhzg cfr_renamed_7693(sprpnl[] arg0) {
        if (arg0 != null) {
            return new sprhzg(arg0);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7692(sprnvg arg0, sprvbh arg1) throws sprtqg {
        this.cfr_renamed_7663(arg1);
        try {
            int n;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprqbm[] sprqbmArray = arg0.cfr_renamed_7563();
            int n2 = n = 0;
            while (n2 != sprqbmArray.length) {
                sprqbmArray[n++].cfr_renamed_2623(byteArrayOutputStream);
                n2 = n;
            }
            this.cfr_renamed_7664(209, byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            throw new sprtqg(spreah.cfr_renamed_9("?\u00162\u00193\u0003|\u00122\u00143\u00139W/\u0002>\u0007=\u00147\u0012(W=\u0005.\u0016%"), iOException);
        }
        this.cfr_renamed_7674();
        return this.cfr_renamed_96.cfr_renamed_1435(this.cfr_renamed_79());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7536(byte[] arg0, int arg1, int arg2) {
        try {
            this.cfr_renamed_272.write(arg0, arg1, arg2);
            return;
        }
        catch (IOException iOException) {
            throw new spreah(iOException.getMessage(), iOException);
        }
    }

    public byte[] cfr_renamed_1972(boolean arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_1310(byteArrayOutputStream2, arg0);
        return byteArrayOutputStream2.toByteArray();
    }

    public sprhzg cfr_renamed_7677() {
        sprzyg sprzyg2 = this;
        return sprzyg2.cfr_renamed_7693(sprzyg2.cfr_renamed_4.cfr_renamed_7677());
    }

    public void cfr_renamed_7694(sprqj arg0, sprvbh arg1) throws sprtqg {
        sprzyg sprzyg2 = this;
        sprzyg2.cfr_renamed_7586(sprzyg2.cfr_renamed_7587(arg0).cfr_renamed_7588(arg1));
    }

    public long cfr_renamed_7541() {
        return this.cfr_renamed_4.cfr_renamed_7541();
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_79 == 1) {
            int n;
            int n2 = arg1 + arg2;
            int n3 = n = arg1;
            while (n3 != n2) {
                this.cfr_renamed_1221(arg0[n++]);
                n3 = n;
            }
        } else {
            this.cfr_renamed_7536(arg0, arg1, arg2);
        }
    }

    public boolean cfr_renamed_7695(sprvbh arg0, sprvbh arg1) throws sprtqg {
        if (this.cfr_renamed_96 == null) {
            throw new sprtqg(sprqrda.cfr_renamed_9("\u000eT\u000e@7t0r*f,v~}1g~z0z*z?\u007f7`;w~>~p?\u007f237}7gv:p"));
        }
        if (24 != this.cfr_renamed_79 && 25 != this.cfr_renamed_79 && 40 != this.cfr_renamed_79) {
            throw new sprtqg(spreah.cfr_renamed_9("/\u001e;\u0019=\u0003)\u00059W5\u0004|\u00193\u0003|\u0016|\u001c9\u000e|\u00155\u00198\u001e2\u0010|\u00045\u00102\u0016(\u0002.\u0012r"));
        }
        return this.cfr_renamed_7673(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_7586(spreg spreg2) {
        void arg0;
        sprzyg sprzyg2 = this;
        this.cfr_renamed_96 = arg0;
        sprzyg2.cfr_renamed_114 = 0;
        sprzyg2.cfr_renamed_272 = spreg2.cfr_renamed_470();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_7660(sprvbh arg0) throws sprtqg {
        try {
            return arg0.cfr_renamed_723.cfr_renamed_7661();
        }
        catch (IOException iOException) {
            throw new sprtqg(sprqrda.cfr_renamed_9("v&p;c*z1}~c,v.r,z0t~x;jp"), iOException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprzyg(sprxcm sprxcm2, sprmhm sprmhm2) {
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_79 = this.cfr_renamed_4.cfr_renamed_7576();
        this.cfr_renamed_1 = sprmhm2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7664(int n, byte[] byArray) {
        void arg1;
        void arg0;
        sprzyg sprzyg2 = this;
        sprzyg2.cfr_renamed_1221((byte)arg0);
        sprzyg2.cfr_renamed_1221((byte)(byArray.length >> 24));
        this.cfr_renamed_1221((byte)(((void)arg1).length >> 16));
        this.cfr_renamed_1221((byte)(((void)arg1).length >> 8));
        this.cfr_renamed_1221((byte)((void)arg1).length);
        this.cfr_renamed_1196((byte[])arg1);
    }

    public int cfr_renamed_2373() {
        return this.cfr_renamed_4.cfr_renamed_2373();
    }

    public void cfr_renamed_1196(byte[] arg0) {
        this.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    public Date cfr_renamed_7696() {
        return new Date(this.cfr_renamed_4.cfr_renamed_7696());
    }

    public boolean cfr_renamed_7682(byte[] arg0, sprvbh arg1) throws sprtqg {
        sprzyg sprzyg2 = this;
        sprzyg sprzyg3 = this;
        sprzyg3.cfr_renamed_7663(arg1);
        sprzyg2.cfr_renamed_7664(180, arg0);
        sprzyg3.cfr_renamed_7674();
        return sprzyg2.cfr_renamed_96.cfr_renamed_1435(this.cfr_renamed_79());
    }

    public static boolean cfr_renamed_7580(int arg0) {
        return 16 == arg0 || 17 == arg0 || 18 == arg0 || 19 == arg0;
    }

    public boolean cfr_renamed_7697(String arg0, sprvbh arg1) throws sprtqg {
        return this.cfr_renamed_7681(sprkoe.cfr_renamed_431(arg0), arg1);
    }

    public static boolean cfr_renamed_7698(sprzyg arg0, sprzyg arg1) {
        return sproze.cfr_renamed_92(arg0.cfr_renamed_4.cfr_renamed_7686(), arg1.cfr_renamed_4.cfr_renamed_7686());
    }

    public static sprzyg cfr_renamed_7699(sprzyg arg0, sprzyg arg1) throws sprtqg {
        int n;
        if (!sprzyg.cfr_renamed_7698(arg0, arg1)) {
            throw new IllegalArgumentException(spreah.cfr_renamed_9("\b\u001f9\u00049W=\u00059W8\u001e:\u00119\u00059\u0019(W/\u001e;\u0019=\u0003)\u00059\u0004r"));
        }
        sprpnl[] sprpnlArray = arg0.cfr_renamed_7678().cfr_renamed_4;
        sprpnl[] sprpnlArray2 = arg1.cfr_renamed_7678().cfr_renamed_4;
        ArrayList<sprpnl> arrayList = new ArrayList<sprpnl>(Arrays.asList(sprpnlArray));
        int n2 = n = 0;
        while (n2 != sprpnlArray2.length) {
            boolean bl;
            sprpnl sprpnl2;
            block5: {
                int n3;
                sprpnl2 = sprpnlArray2[n];
                boolean bl2 = false;
                int n4 = n3 = 0;
                while (n4 != sprpnlArray.length) {
                    sprpnl sprpnl3 = sprpnlArray[n3];
                    if (sprpnl2.equals(sprpnl3)) {
                        bl = bl2 = true;
                        break block5;
                    }
                    n4 = ++n3;
                }
                bl = bl2;
            }
            if (!bl) {
                arrayList.add(sprpnl2);
            }
            n2 = ++n;
        }
        sprpnl[] sprpnlArray3 = arrayList.toArray(new sprpnl[0]);
        return new sprzyg(new sprxcm(arg0.cfr_renamed_7576(), arg0.cfr_renamed_7541(), arg0.cfr_renamed_2373(), arg0.cfr_renamed_579(), arg0.cfr_renamed_7677().cfr_renamed_4, sprpnlArray3, arg0.cfr_renamed_7689(), arg0.cfr_renamed_4.cfr_renamed_79()));
    }
}

