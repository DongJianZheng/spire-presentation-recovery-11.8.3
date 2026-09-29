/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbcd;
import com.spire.presentation.packages.sprbuc;
import com.spire.presentation.packages.sprcvc;
import com.spire.presentation.packages.spresc;
import com.spire.presentation.packages.spresy;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprgc;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.spriyc;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprlwc;
import com.spire.presentation.packages.sprmxc;
import com.spire.presentation.packages.sprmzc;
import com.spire.presentation.packages.sprpbd;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprqi;
import com.spire.presentation.packages.sprtdm;
import com.spire.presentation.packages.sprvyc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.spryrc;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Vector;

public class spriuc
extends sprlwc {
    public boolean cfr_renamed_4 = true;

    public boolean cfr_renamed_3099() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_3100(spriyc arg0, sprbuc arg1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg1.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public void cfr_renamed_3101(spriyc arg0, byte[] arg1) throws IOException {
        byte[] byArray;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg1);
        sprpxc sprpxc2 = sprzsc.cfr_renamed_2657(byteArrayInputStream);
        if (!sprpxc2.cfr_renamed_2848()) {
            throw new spryad(47);
        }
        byte[] byArray2 = sprzsc.cfr_renamed_2632(32, byteArrayInputStream);
        if (sprzsc.cfr_renamed_2763(byteArrayInputStream).length > 32) {
            throw new spryad(47);
        }
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        byte[] byArray3 = sprzsc.cfr_renamed_2763(byteArrayInputStream2);
        int n = sprzsc.cfr_renamed_2660(byteArrayInputStream2);
        if (n < 2 || (n & 1) != 0) {
            throw new spryad(50);
        }
        arg0.cfr_renamed_91 = sprzsc.cfr_renamed_2754(n / 2, byteArrayInputStream);
        short s = sprzsc.cfr_renamed_2630(byteArrayInputStream);
        if (s < 1) {
            throw new spryad(47);
        }
        spriyc spriyc2 = arg0;
        arg0.cfr_renamed_137 = sprzsc.cfr_renamed_2711(s, byteArrayInputStream);
        spriyc2.cfr_renamed_152 = sprkxc.cfr_renamed_2849(byteArrayInputStream);
        arg0.cfr_renamed_2.cfr_renamed_2850(sprpxc2);
        spriyc2.cfr_renamed_79.cfr_renamed_2851(sprpxc2);
        spriyc2.cfr_renamed_2.cfr_renamed_2666().cfr_renamed_86 = byArray2;
        spriyc2.cfr_renamed_79.cfr_renamed_2852(arg0.cfr_renamed_91);
        spriyc2.cfr_renamed_79.cfr_renamed_2853(arg0.cfr_renamed_137);
        if (sprzra.cfr_renamed_539(spriyc2.cfr_renamed_91, 255)) {
            arg0.cfr_renamed_4 = true;
        }
        if ((byArray = sprzsc.cfr_renamed_2642(arg0.cfr_renamed_152, sprkxc.cfr_renamed_86)) != null) {
            arg0.cfr_renamed_4 = true;
            if (!sprzra.cfr_renamed_559(byArray, sprkxc.cfr_renamed_2833(sprzsc.cfr_renamed_1))) {
                throw new spryad(40);
            }
        }
        spriyc spriyc3 = arg0;
        spriyc3.cfr_renamed_79.cfr_renamed_2854(spriyc3.cfr_renamed_4);
        if (spriyc3.cfr_renamed_152 != null) {
            spriyc spriyc4 = arg0;
            spriyc4.cfr_renamed_79.cfr_renamed_2855(spriyc4.cfr_renamed_152);
        }
    }

    public byte[] cfr_renamed_3102(spriyc arg0, sprfrc arg1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg1.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public void cfr_renamed_3103(spriyc arg0, byte[] arg1) throws IOException {
        Vector vector = sprkxc.cfr_renamed_2885(new ByteArrayInputStream(arg1));
        arg0.cfr_renamed_79.cfr_renamed_2884(vector);
    }

    /*
     * WARNING - void declaration
     */
    public sprmxc cfr_renamed_3104(spriyc spriyc2, spresc spresc2) throws IOException {
        Object object;
        byte[] byArray;
        sprcvc sprcvc2;
        void v13;
        Object object2;
        Object object3;
        sprbbd sprbbd2;
        void arg1;
        void arg0;
        sprgbd sprgbd2 = spriyc2.cfr_renamed_2.cfr_renamed_2666();
        void v0 = arg0;
        spryrc spryrc2 = new spryrc(v0.cfr_renamed_2, (spresc)arg1);
        sprcvc sprcvc3 = spryrc2.cfr_renamed_3105();
        Object object4 = arg1.cfr_renamed_3106();
        v0.cfr_renamed_2.cfr_renamed_2850((sprpxc)object4);
        if (sprcvc3.cfr_renamed_324() != 1) {
            throw new spryad(10);
        }
        spriuc spriuc2 = this;
        spriuc2.cfr_renamed_3101((spriyc)arg0, sprcvc3.cfr_renamed_2573());
        object4 = spriuc2.cfr_renamed_3107((spriyc)arg0);
        if (arg0.cfr_renamed_3 >= 0) {
            int n = 1 << 8 + arg0.cfr_renamed_3;
            arg1.cfr_renamed_2838(n);
        }
        sprgbd sprgbd3 = sprgbd2;
        void v3 = arg0;
        sprgbd2.cfr_renamed_4 = v3.cfr_renamed_1;
        sprgbd3.cfr_renamed_119 = v3.cfr_renamed_86;
        sprgbd3.cfr_renamed_91 = sprkxc.cfr_renamed_2839(arg0.cfr_renamed_2, arg0.cfr_renamed_1);
        sprgbd2.cfr_renamed_3 = 12;
        spryrc spryrc3 = spryrc2;
        spryrc3.cfr_renamed_3108((short)2, (byte[])object4);
        spryrc3.cfr_renamed_2841();
        object4 = arg0.cfr_renamed_79.cfr_renamed_2418();
        if (object4 != null) {
            byte[] byArray2 = spriuc.cfr_renamed_3109((Vector)object4);
            spryrc2.cfr_renamed_3108((short)23, byArray2);
        }
        void v5 = arg0;
        v5.cfr_renamed_132 = v5.cfr_renamed_79.cfr_renamed_2875();
        v5.cfr_renamed_132.cfr_renamed_2797(arg0.cfr_renamed_2);
        v5.cfr_renamed_102 = v5.cfr_renamed_79.cfr_renamed_2876();
        sprbbd sprbbd3 = null;
        if (arg0.cfr_renamed_102 == null) {
            sprbbd2 = sprbbd3;
            arg0.cfr_renamed_132.cfr_renamed_2798();
        } else {
            void v7 = arg0;
            v7.cfr_renamed_132.spr\u3027(v7.cfr_renamed_102);
            sprbbd2 = sprbbd3 = v7.cfr_renamed_102.cfr_renamed_2141();
            object3 = spriuc.cfr_renamed_3110(sprbbd3);
            spryrc2.cfr_renamed_3108((short)11, (byte[])object3);
        }
        if (sprbbd2 == null || sprbbd3.cfr_renamed_29()) {
            arg0.cfr_renamed_93 = false;
        }
        if (arg0.cfr_renamed_93) {
            sprvyc sprvyc2 = arg0.cfr_renamed_79.cfr_renamed_2878();
            object3 = sprvyc2;
            if (sprvyc2 != null) {
                object2 = this.cfr_renamed_3111((spriyc)arg0, (sprvyc)object3);
                spryrc2.cfr_renamed_3108((short)22, (byte[])object2);
            }
        }
        if ((object3 = arg0.cfr_renamed_132.cfr_renamed_2879()) != null) {
            spryrc2.cfr_renamed_3108((short)12, (byte[])object3);
        }
        if (arg0.cfr_renamed_102 != null) {
            void v9 = arg0;
            v9.cfr_renamed_119 = v9.cfr_renamed_79.cfr_renamed_2880();
            if (v9.cfr_renamed_119 != null) {
                void v10 = arg0;
                arg0.cfr_renamed_132.cfr_renamed_2803(v10.cfr_renamed_119);
                object2 = this.cfr_renamed_3102((spriyc)v10, arg0.cfr_renamed_119);
                spryrc spryrc4 = spryrc2;
                spryrc4.cfr_renamed_3108((short)13, (byte[])object2);
                sprzsc.cfr_renamed_2689(spryrc4.cfr_renamed_2881(), arg0.cfr_renamed_119.cfr_renamed_2882());
            }
        }
        spryrc spryrc5 = spryrc2;
        spryrc5.cfr_renamed_3108((short)14, sprzsc.cfr_renamed_1);
        spryrc5.cfr_renamed_2881().cfr_renamed_2883();
        sprcvc3 = spryrc5.cfr_renamed_3105();
        if (sprcvc3.cfr_renamed_324() == 23) {
            this.cfr_renamed_3103((spriyc)arg0, sprcvc3.cfr_renamed_2573());
            sprcvc3 = spryrc2.cfr_renamed_3105();
            v13 = arg0;
        } else {
            void v14 = arg0;
            v13 = v14;
            v14.cfr_renamed_79.cfr_renamed_2884(null);
        }
        if (v13.cfr_renamed_119 == null) {
            sprcvc2 = sprcvc3;
            arg0.cfr_renamed_132.cfr_renamed_2845();
        } else if (sprcvc3.cfr_renamed_324() == 11) {
            this.cfr_renamed_3112((spriyc)arg0, sprcvc3.cfr_renamed_2573());
            sprcvc2 = sprcvc3 = spryrc2.cfr_renamed_3105();
        } else {
            if (sprzsc.cfr_renamed_2631(arg0.cfr_renamed_2)) {
                throw new spryad(10);
            }
            this.cfr_renamed_3113((spriyc)arg0, sprbbd.cfr_renamed_4);
            sprcvc2 = sprcvc3;
        }
        if (sprcvc2.cfr_renamed_324() != 16) {
            throw new spryad(10);
        }
        void v16 = arg0;
        this.cfr_renamed_3114((spriyc)v16, sprcvc3.cfr_renamed_2573());
        sprkxc.cfr_renamed_2858(v16.cfr_renamed_2, arg0.cfr_renamed_132);
        arg1.cfr_renamed_3115(arg0.cfr_renamed_79.cfr_renamed_2471());
        object2 = spryrc2.cfr_renamed_2861();
        if (this.cfr_renamed_3116((spriyc)arg0)) {
            byArray = spryrc2.cfr_renamed_3117((short)15);
            this.cfr_renamed_3118((spriyc)arg0, byArray, (sprgg)object2);
        }
        void v17 = arg0;
        byArray = sprzsc.cfr_renamed_2664(v17.cfr_renamed_2, "client finished", sprkxc.cfr_renamed_2822(arg0.cfr_renamed_2, spryrc2.cfr_renamed_2881(), null));
        this.cfr_renamed_3119(spryrc2.cfr_renamed_3117((short)20), byArray);
        if (v17.cfr_renamed_107) {
            object = arg0.cfr_renamed_79.cfr_renamed_2888();
            byte[] byArray3 = this.cfr_renamed_3100((spriyc)arg0, (sprbuc)object);
            spryrc2.cfr_renamed_3108((short)4, byArray3);
        }
        void v18 = arg0;
        object = sprzsc.cfr_renamed_2664(v18.cfr_renamed_2, "server finished", sprkxc.cfr_renamed_2822(arg0.cfr_renamed_2, spryrc2.cfr_renamed_2881(), null));
        spryrc spryrc6 = spryrc2;
        spryrc6.cfr_renamed_3108((short)20, (byte[])object);
        spryrc6.cfr_renamed_3120();
        v18.cfr_renamed_79.cfr_renamed_2941();
        return new sprmxc((spresc)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public spriuc(SecureRandom secureRandom) {
        super((SecureRandom)arg0);
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmxc cfr_renamed_3121(sprqi arg0, sprgc arg1) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(spresy.cfr_renamed_9("\u0006KDJW]S\u001f\u0001[@VOWU\u0018C]\u0001VTTM"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprtdm.cfr_renamed_9("\u0011\u001aD\u000fX\u001dF\u0001D\u001a\u0011NU\u000fX\u0000Y\u001a\u0016\fSNX\u001bZ\u0002"));
        }
        sprgbd sprgbd2 = new sprgbd();
        new sprgbd().cfr_renamed_2 = 0;
        spriyc spriyc2 = new spriyc();
        new spriyc().cfr_renamed_79 = arg0;
        spriyc spriyc3 = spriyc2;
        new spriyc().cfr_renamed_2 = new sprmzc((SecureRandom)this.cfr_renamed_4, sprgbd2);
        new sprgbd().cfr_renamed_93 = sprkxc.cfr_renamed_2864(new spriyc().cfr_renamed_79.cfr_renamed_2865(), spriyc2.cfr_renamed_2.cfr_renamed_2866());
        arg0.spr\u2102(spriyc2.cfr_renamed_2);
        spresc spresc2 = new spresc(arg1, spriyc2.cfr_renamed_2, arg0, 22);
        try {
            return this.cfr_renamed_3104(spriyc2, spresc2);
        }
        catch (spryad spryad2) {
            spryad spryad3 = spryad2;
            spresc2.spr\u3028\ufe34(spryad3.cfr_renamed_2909());
            throw spryad3;
        }
        catch (IOException iOException) {
            spresc2.spr\u3028\ufe34((short)80);
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            spresc2.spr\u3028\ufe34((short)80);
            throw new spryad(80);
        }
    }

    public void cfr_renamed_3122(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public boolean cfr_renamed_3116(spriyc arg0) {
        return arg0.cfr_renamed_105 >= 0 && sprzsc.cfr_renamed_2714(arg0.cfr_renamed_105);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_3118(spriyc arg0, byte[] arg1, sprgg arg2) throws IOException {
        boolean bl;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg1);
        sprpbd sprpbd2 = sprpbd.cfr_renamed_2628(arg0.cfr_renamed_2, byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        boolean bl2 = false;
        try {
            sprkc sprkc2;
            spriyc spriyc2;
            byte[] byArray;
            if (sprzsc.cfr_renamed_2631(arg0.cfr_renamed_2)) {
                byArray = arg2.cfr_renamed_2821(sprpbd2.cfr_renamed_593().cfr_renamed_2690());
                spriyc2 = arg0;
            } else {
                spriyc spriyc3 = arg0;
                spriyc2 = spriyc3;
                byArray = sprkxc.cfr_renamed_2822(spriyc3.cfr_renamed_2, arg2, null);
            }
            sprhgb sprhgb2 = sprhcd.cfr_renamed_1531(spriyc2.cfr_renamed_0.cfr_renamed_2720(0).cfr_renamed_1489());
            sprkc sprkc3 = sprkc2 = sprzsc.cfr_renamed_2765(arg0.cfr_renamed_105);
            sprkc3.cfr_renamed_2797(arg0.cfr_renamed_2);
            bl = bl2 = sprkc3.cfr_renamed_2807(sprpbd2.cfr_renamed_593(), sprpbd2.cfr_renamed_79(), sprhgb2, byArray);
        }
        catch (Exception exception) {
            bl = bl2;
        }
        if (!bl) {
            throw new spryad(51);
        }
    }

    public void cfr_renamed_3112(spriyc arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg1);
        sprbbd sprbbd2 = sprbbd.cfr_renamed_2661(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        this.cfr_renamed_3113(arg0, sprbbd2);
    }

    public void cfr_renamed_3114(spriyc arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream = new ByteArrayInputStream(arg1);
        arg0.cfr_renamed_132.cfr_renamed_2857(byteArrayInputStream2);
        sprkxc.cfr_renamed_2674(byteArrayInputStream2);
    }

    public byte[] cfr_renamed_3111(spriyc arg0, sprvyc arg1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg1.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public void cfr_renamed_3113(spriyc arg0, sprbbd arg1) throws IOException {
        spriyc spriyc2;
        if (arg0.cfr_renamed_119 == null) {
            throw new IllegalStateException();
        }
        if (arg0.cfr_renamed_0 != null) {
            throw new spryad(10);
        }
        arg0.cfr_renamed_0 = arg1;
        if (arg1.cfr_renamed_29()) {
            spriyc spriyc3 = arg0;
            spriyc2 = spriyc3;
            spriyc3.cfr_renamed_132.cfr_renamed_2845();
        } else {
            spriyc2 = arg0;
            spriyc spriyc4 = arg0;
            arg0.cfr_renamed_105 = sprzsc.cfr_renamed_2719(arg1, spriyc4.cfr_renamed_102.cfr_renamed_2141());
            spriyc4.cfr_renamed_132.cfr_renamed_2846(arg1);
        }
        spriyc2.cfr_renamed_79.cfr_renamed_2843(arg1);
    }

    public byte[] cfr_renamed_3107(spriyc arg0) throws IOException {
        spriyc spriyc2 = arg0;
        sprgbd sprgbd2 = spriyc2.cfr_renamed_2.cfr_renamed_2666();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprpxc sprpxc2 = spriyc2.cfr_renamed_79.cfr_renamed_2683();
        if (!sprpxc2.cfr_renamed_2742(arg0.cfr_renamed_2.cfr_renamed_2824())) {
            throw new spryad(80);
        }
        spriyc spriyc3 = arg0;
        arg0.cfr_renamed_2.cfr_renamed_2828(sprpxc2);
        sprzsc.cfr_renamed_2749(spriyc3.cfr_renamed_2.cfr_renamed_2683(), byteArrayOutputStream);
        byteArrayOutputStream.write(sprgbd2.cfr_renamed_2727());
        sprzsc.cfr_renamed_2638(sprzsc.cfr_renamed_1, byteArrayOutputStream);
        arg0.cfr_renamed_1 = spriyc3.cfr_renamed_79.cfr_renamed_2829();
        if (!sprzra.cfr_renamed_539(arg0.cfr_renamed_91, arg0.cfr_renamed_1) || arg0.cfr_renamed_1 == 0 || arg0.cfr_renamed_1 == 255 || !sprzsc.cfr_renamed_2750(arg0.cfr_renamed_1, sprpxc2)) {
            throw new spryad(80);
        }
        spriyc spriyc4 = arg0;
        spriuc.cfr_renamed_3123(spriyc4.cfr_renamed_1, (short)80);
        spriyc4.cfr_renamed_86 = spriyc4.cfr_renamed_79.cfr_renamed_2830();
        if (!sprzra.cfr_renamed_557(spriyc4.cfr_renamed_137, arg0.cfr_renamed_86)) {
            throw new spryad(80);
        }
        spriyc spriyc5 = arg0;
        sprzsc.cfr_renamed_2648(spriyc5.cfr_renamed_1, byteArrayOutputStream);
        sprzsc.cfr_renamed_2676(spriyc5.cfr_renamed_86, byteArrayOutputStream);
        spriyc5.cfr_renamed_112 = spriyc5.cfr_renamed_79.cfr_renamed_2831();
        if (spriyc5.cfr_renamed_4) {
            boolean bl;
            byte[] byArray = sprzsc.cfr_renamed_2642(arg0.cfr_renamed_112, sprkxc.cfr_renamed_86);
            boolean bl2 = bl = null == byArray;
            if (bl) {
                spriyc spriyc6 = arg0;
                spriyc6.cfr_renamed_112 = sprbcd.cfr_renamed_2832(spriyc6.cfr_renamed_112);
                spriyc6.cfr_renamed_112.put(sprkxc.cfr_renamed_86, sprkxc.cfr_renamed_2833(sprzsc.cfr_renamed_1));
            }
        }
        if (arg0.cfr_renamed_112 != null) {
            spriyc spriyc7 = arg0;
            sprgbd2.cfr_renamed_1 = sprbcd.cfr_renamed_2834(arg0.cfr_renamed_112);
            spriyc spriyc8 = arg0;
            spriyc7.cfr_renamed_3 = spriuc.cfr_renamed_3124(spriyc8.cfr_renamed_152, spriyc8.cfr_renamed_112, (short)80);
            sprgbd2.cfr_renamed_0 = sprbcd.cfr_renamed_2836(spriyc7.cfr_renamed_112);
            arg0.cfr_renamed_93 = sprzsc.cfr_renamed_2655(arg0.cfr_renamed_112, sprbcd.cfr_renamed_0, (short)80);
            spriyc7.cfr_renamed_107 = sprzsc.cfr_renamed_2655(spriyc7.cfr_renamed_112, sprkxc.cfr_renamed_84, (short)80);
            sprkxc.cfr_renamed_2837(byteArrayOutputStream, arg0.cfr_renamed_112);
        }
        return byteArrayOutputStream.toByteArray();
    }
}

