/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbcd;
import com.spire.presentation.packages.sprbuc;
import com.spire.presentation.packages.sprdtc;
import com.spire.presentation.packages.sprek;
import com.spire.presentation.packages.spresc;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprgc;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.sprirc;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprlwc;
import com.spire.presentation.packages.sprmxc;
import com.spire.presentation.packages.sprpbd;
import com.spire.presentation.packages.sprppr;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprqje;
import com.spire.presentation.packages.sprquc;
import com.spire.presentation.packages.sprsbd;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprvyc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.spryrc;
import com.spire.presentation.packages.sprzc;
import com.spire.presentation.packages.sprzk;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprerc
extends sprlwc {
    public void cfr_renamed_3161(sprquc arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        if (!arg0.cfr_renamed_132) {
            throw new spryad(10);
        }
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream = new ByteArrayInputStream(arg1);
        arg0.cfr_renamed_91 = sprvyc.cfr_renamed_2661(byteArrayInputStream2);
        sprkxc.cfr_renamed_2674(byteArrayInputStream2);
    }

    public void cfr_renamed_3162(sprquc arg0, sprpxc arg1) throws IOException {
        sprdtc sprdtc2 = arg0.cfr_renamed_107;
        sprpxc sprpxc2 = sprdtc2.cfr_renamed_2683();
        if (null == sprpxc2) {
            sprdtc2.cfr_renamed_2828(arg1);
            arg0.cfr_renamed_152.cfr_renamed_3056(arg1);
            return;
        }
        if (!sprpxc2.cfr_renamed_3084(arg1)) {
            throw new spryad(47);
        }
    }

    public void spr\u3181\ufe34(sprquc arg0, byte[] arg1) throws IOException {
        Vector vector = sprkxc.cfr_renamed_2885(new ByteArrayInputStream(arg1));
        arg0.cfr_renamed_152.cfr_renamed_2416(vector);
    }

    public void cfr_renamed_3163(sprquc arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg1);
        sprbuc sprbuc2 = sprbuc.cfr_renamed_2661(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        arg0.cfr_renamed_152.cfr_renamed_3043(sprbuc2);
    }

    public sprbbd cfr_renamed_3164(sprquc arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg1);
        sprbbd sprbbd2 = sprbbd.cfr_renamed_2661(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        sprquc sprquc2 = arg0;
        sprquc2.cfr_renamed_86.cfr_renamed_2786(sprbbd2);
        sprquc2.cfr_renamed_1 = sprquc2.cfr_renamed_152.cfr_renamed_3036();
        sprbbd sprbbd3 = sprbbd2;
        sprquc2.cfr_renamed_1.cfr_renamed_2422(sprbbd3);
        return sprbbd3;
    }

    public void cfr_renamed_3165(sprquc arg0, byte[] arg1) throws IOException {
        sprquc sprquc2 = arg0;
        sprgbd sprgbd2 = sprquc2.cfr_renamed_107.cfr_renamed_2666();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg1);
        sprpxc sprpxc2 = sprzsc.cfr_renamed_2657(byteArrayInputStream);
        this.cfr_renamed_3162(arg0, sprpxc2);
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        sprgbd2.cfr_renamed_93 = sprzsc.cfr_renamed_2632(32, byteArrayInputStream2);
        sprquc2.cfr_renamed_4 = sprzsc.cfr_renamed_2763(byteArrayInputStream2);
        if (sprquc2.cfr_renamed_4.length > 32) {
            throw new spryad(47);
        }
        arg0.cfr_renamed_152.cfr_renamed_3055(arg0.cfr_renamed_4);
        arg0.cfr_renamed_114 = sprzsc.cfr_renamed_2660(byteArrayInputStream);
        if (!sprzra.cfr_renamed_539(arg0.cfr_renamed_105, arg0.cfr_renamed_114) || arg0.cfr_renamed_114 == 0 || arg0.cfr_renamed_114 == 255 || !sprzsc.cfr_renamed_2750(arg0.cfr_renamed_114, sprpxc2)) {
            throw new spryad(47);
        }
        sprquc sprquc3 = arg0;
        sprerc.cfr_renamed_3123(sprquc3.cfr_renamed_114, (short)47);
        sprquc3.cfr_renamed_152.cfr_renamed_3057(arg0.cfr_renamed_114);
        sprquc3.cfr_renamed_119 = sprzsc.cfr_renamed_2630(byteArrayInputStream);
        if (!sprzra.cfr_renamed_557(arg0.cfr_renamed_93, arg0.cfr_renamed_119)) {
            throw new spryad(47);
        }
        sprquc sprquc4 = arg0;
        sprquc4.cfr_renamed_152.cfr_renamed_3058(sprquc4.cfr_renamed_119);
        Hashtable hashtable = sprkxc.cfr_renamed_2849(byteArrayInputStream);
        if (hashtable != null) {
            boolean bl;
            Object object;
            Enumeration enumeration = hashtable.keys();
            while (enumeration.hasMoreElements()) {
                object = (Integer)enumeration.nextElement();
                if (((Integer)object).equals(sprkxc.cfr_renamed_86) || null != sprzsc.cfr_renamed_2642(arg0.cfr_renamed_112, (Integer)object)) continue;
                throw new spryad(110);
            }
            byte[] byArray = (byte[])hashtable.get(sprkxc.cfr_renamed_86);
            object = byArray;
            if (byArray != null) {
                arg0.cfr_renamed_145 = true;
                if (!sprzra.cfr_renamed_559((byte[])object, sprkxc.cfr_renamed_2833(sprzsc.cfr_renamed_1))) {
                    throw new spryad(40);
                }
            }
            if ((bl = sprbcd.cfr_renamed_2834(hashtable)) && !sprzsc.cfr_renamed_2732(arg0.cfr_renamed_114)) {
                throw new spryad(47);
            }
            sprgbd2.cfr_renamed_1 = bl;
            Hashtable hashtable2 = hashtable;
            arg0.cfr_renamed_3 = sprerc.cfr_renamed_3124(arg0.cfr_renamed_112, hashtable2, (short)47);
            sprgbd2.cfr_renamed_0 = sprbcd.cfr_renamed_2836(hashtable2);
            sprquc sprquc5 = arg0;
            sprquc5.cfr_renamed_132 = sprzsc.cfr_renamed_2655(hashtable, sprbcd.cfr_renamed_0, (short)47);
            sprquc5.cfr_renamed_96 = sprzsc.cfr_renamed_2655(hashtable, sprkxc.cfr_renamed_84, (short)47);
        }
        sprquc sprquc6 = arg0;
        sprquc6.cfr_renamed_152.cfr_renamed_2854(sprquc6.cfr_renamed_145);
        if (sprquc6.cfr_renamed_112 != null) {
            arg0.cfr_renamed_152.cfr_renamed_3059(hashtable);
        }
    }

    public void cfr_renamed_3166(sprquc arg0, byte[] arg1) throws IOException {
        if (arg0.cfr_renamed_1 == null) {
            throw new spryad(40);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg1);
        sprquc sprquc2 = arg0;
        sprquc2.cfr_renamed_0 = sprfrc.cfr_renamed_2628(sprquc2.cfr_renamed_107, byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        sprquc2.cfr_renamed_86.cfr_renamed_2803(arg0.cfr_renamed_0);
    }

    public byte[] cfr_renamed_3167(sprquc arg0, sprpbd arg1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg1.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public sprerc(SecureRandom arg0) {
        super(arg0);
    }

    public byte[] cfr_renamed_3168(sprquc arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg1);
        sprpxc sprpxc2 = sprzsc.cfr_renamed_2657(byteArrayInputStream);
        byte[] byArray = sprzsc.cfr_renamed_2763(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        if (!sprpxc2.cfr_renamed_2742(arg0.cfr_renamed_107.cfr_renamed_2824())) {
            throw new spryad(47);
        }
        if (!sprpxc.cfr_renamed_3.cfr_renamed_2742(sprpxc2) && byArray.length > 32) {
            throw new spryad(47);
        }
        return byArray;
    }

    public static byte[] cfr_renamed_3169(byte[] arg0, byte[] arg1) throws IOException {
        int n = 34;
        short s = sprzsc.cfr_renamed_2762(arg0, n);
        int n2 = n + 1 + s;
        int n3 = n2 + 1;
        byte[] byArray = new byte[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, byArray, 0, n2);
        sprzsc.cfr_renamed_2639(arg1.length);
        sprzsc.cfr_renamed_2723(arg1.length, byArray, n2);
        System.arraycopy(arg1, 0, byArray, n3, arg1.length);
        int n4 = n3;
        System.arraycopy(arg0, n4, byArray, n4 + arg1.length, arg0.length - n3);
        return byArray;
    }

    public byte[] cfr_renamed_3170(sprquc arg0, sprek arg1) throws IOException {
        boolean bl;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprpxc sprpxc2 = arg1.cfr_renamed_2824();
        if (!sprpxc2.cfr_renamed_2848()) {
            throw new spryad(80);
        }
        sprquc sprquc2 = arg0;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        arg0.cfr_renamed_107.cfr_renamed_2850(sprpxc2);
        sprzsc.cfr_renamed_2749(sprpxc2, byteArrayOutputStream2);
        byteArrayOutputStream2.write(sprquc2.cfr_renamed_107.cfr_renamed_2666().cfr_renamed_2726());
        byte[] byArray = sprzsc.cfr_renamed_1;
        if (sprquc2.cfr_renamed_137 != null && ((byArray = arg0.cfr_renamed_137.cfr_renamed_2811()) == null || byArray.length > 32)) {
            byArray = sprzsc.cfr_renamed_1;
        }
        sprzsc.cfr_renamed_2638(byArray, byteArrayOutputStream);
        sprzsc.cfr_renamed_2638(sprzsc.cfr_renamed_1, byteArrayOutputStream);
        arg0.cfr_renamed_105 = arg1.cfr_renamed_3048();
        arg0.cfr_renamed_112 = arg1.cfr_renamed_3051();
        byte[] byArray2 = sprzsc.cfr_renamed_2642(arg0.cfr_renamed_112, sprkxc.cfr_renamed_86);
        boolean bl2 = null == byArray2;
        boolean bl3 = bl = !sprzra.cfr_renamed_539(arg0.cfr_renamed_105, 255);
        if (bl2 && bl) {
            arg0.cfr_renamed_105 = sprzra.cfr_renamed_542(arg0.cfr_renamed_105, 255);
        }
        sprquc sprquc3 = arg0;
        sprzsc.cfr_renamed_2752(sprquc3.cfr_renamed_105, byteArrayOutputStream);
        short[] sArray = new short[1];
        sArray[0] = 0;
        arg0.cfr_renamed_93 = sArray;
        sprzsc.cfr_renamed_2706(sprquc3.cfr_renamed_93, byteArrayOutputStream);
        if (arg0.cfr_renamed_112 != null) {
            sprkxc.cfr_renamed_2837(byteArrayOutputStream, arg0.cfr_renamed_112);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmxc cfr_renamed_3171(sprek arg0, sprgc arg1) throws IOException {
        spruuc spruuc2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqje.cfr_renamed_9(":rqxx\u007fi6=r|\u007fs~i1\u007ft=\u007fh}q"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprppr.cfr_renamed_9("@\u0003\u0015\u0016\t\u0004\u0017\u0018\u0015\u0003@W\u0004\u0016\t\u0019\b\u0003G\u0015\u0002W\t\u0002\u000b\u001b"));
        }
        sprgbd sprgbd2 = new sprgbd();
        new sprgbd().cfr_renamed_2 = 1;
        sprquc sprquc2 = new sprquc();
        new sprquc().cfr_renamed_152 = arg0;
        sprquc sprquc3 = sprquc2;
        new sprquc().cfr_renamed_107 = new sprdtc(this.cfr_renamed_4, sprgbd2);
        new sprgbd().cfr_renamed_86 = sprkxc.cfr_renamed_2864(new sprquc().cfr_renamed_152.cfr_renamed_2865(), sprquc2.cfr_renamed_107.cfr_renamed_2866());
        arg0.cfr_renamed_3053(sprquc2.cfr_renamed_107);
        spresc spresc2 = new spresc(arg1, sprquc2.cfr_renamed_107, arg0, 22);
        sprzc sprzc2 = sprquc2.cfr_renamed_152.cfr_renamed_3054();
        if (sprzc2 != null && (spruuc2 = sprzc2.cfr_renamed_2813()) != null) {
            sprquc sprquc4 = sprquc2;
            sprquc4.cfr_renamed_137 = sprzc2;
            sprquc4.cfr_renamed_102 = spruuc2;
        }
        try {
            return this.cfr_renamed_3172(sprquc2, spresc2);
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public sprmxc cfr_renamed_3172(sprquc arg0, spresc arg1) throws IOException {
        var3_3 = arg0.cfr_renamed_107.cfr_renamed_2666();
        var4_4 = new spryrc(arg0.cfr_renamed_107, arg1);
        v0 = arg0;
        var5_5 = this.cfr_renamed_3170(v0, v0.cfr_renamed_152);
        v1 = var4_4;
        v1.cfr_renamed_3108((short)1, var5_5);
        v2 = var6_6 = v1.cfr_renamed_3105();
        while (v2.cfr_renamed_324() == 3) {
            var7_7 = arg1.cfr_renamed_3152();
            if (!var7_7.cfr_renamed_2742((sprpxc)(var8_10 = arg0.cfr_renamed_107.cfr_renamed_2824()))) {
                throw new spryad(47);
            }
            var9_11 /* !! */  = this.cfr_renamed_3168(arg0, var6_6.cfr_renamed_2573());
            var10_12 /* !! */  = sprerc.cfr_renamed_3169(var5_5, var9_11 /* !! */ );
            v3 = var4_4;
            v3.cfr_renamed_3137();
            v3.cfr_renamed_3108((short)1, var10_12 /* !! */ );
            v2 = v3.cfr_renamed_3105();
        }
        if (var6_6.cfr_renamed_324() != 2) {
            throw new spryad(10);
        }
        v4 = arg0;
        this.cfr_renamed_3162(arg0, arg1.cfr_renamed_3106());
        this.cfr_renamed_3165(v4, var6_6.cfr_renamed_2573());
        if (v4.cfr_renamed_3 >= 0) {
            var7_8 = 1 << 8 + arg0.cfr_renamed_3;
            arg1.cfr_renamed_2838(var7_8);
        }
        v5 = var3_3;
        v6 = arg0;
        var3_3.cfr_renamed_4 = v6.cfr_renamed_114;
        v5.cfr_renamed_119 = v6.cfr_renamed_119;
        v5.cfr_renamed_91 = sprkxc.cfr_renamed_2839(arg0.cfr_renamed_107, arg0.cfr_renamed_114);
        var3_3.cfr_renamed_3 = 12;
        var4_4.cfr_renamed_2841();
        if (arg0.cfr_renamed_4.length <= 0 || arg0.cfr_renamed_137 == null) ** GOTO lbl-1000
        v7 = arg0;
        if (sprzra.cfr_renamed_92(v7.cfr_renamed_4, v7.cfr_renamed_137.cfr_renamed_2811())) {
            v8 = true;
        } else lbl-1000:
        // 2 sources

        {
            v8 = var7_9 = false;
        }
        if (var7_9) {
            if (var3_3.cfr_renamed_2840() != arg0.cfr_renamed_102.cfr_renamed_2840() || var3_3.cfr_renamed_3050() != arg0.cfr_renamed_102.cfr_renamed_3050()) {
                throw new spryad(47);
            }
            var3_3.cfr_renamed_152 = sprzra.cfr_renamed_158(arg0.cfr_renamed_102.cfr_renamed_2667());
            v9 = arg0;
            arg1.cfr_renamed_3115(v9.cfr_renamed_152.cfr_renamed_2471());
            v10 = arg0;
            var8_10 = sprzsc.cfr_renamed_2664(arg0.cfr_renamed_107, "server finished", sprkxc.cfr_renamed_2822(v10.cfr_renamed_107, var4_4.cfr_renamed_2881(), null));
            this.cfr_renamed_3119(var4_4.cfr_renamed_3117((short)20), (byte[])var8_10);
            var9_11 /* !! */  = sprzsc.cfr_renamed_2664(v10.cfr_renamed_107, "client finished", sprkxc.cfr_renamed_2822(arg0.cfr_renamed_107, var4_4.cfr_renamed_2881(), null));
            v11 = var4_4;
            v11.cfr_renamed_3108((short)20, var9_11 /* !! */ );
            v11.cfr_renamed_3120();
            v9.cfr_renamed_107.cfr_renamed_2940(arg0.cfr_renamed_137);
            v9.cfr_renamed_152.cfr_renamed_2941();
            return new sprmxc(arg1);
        }
        this.cfr_renamed_3173(arg0);
        if (arg0.cfr_renamed_4.length > 0) {
            v12 = arg0;
            arg0.cfr_renamed_137 = new sprirc(arg0.cfr_renamed_4, null);
        }
        if ((var6_6 = var4_4.cfr_renamed_3105()).cfr_renamed_324() == 23) {
            this.spr\u3181\ufe34(arg0, var6_6.cfr_renamed_2573());
            var6_6 = var4_4.cfr_renamed_3105();
            v13 = arg0;
        } else {
            v14 = arg0;
            v13 = v14;
            v14.cfr_renamed_152.cfr_renamed_2416(null);
        }
        v13.cfr_renamed_86 = arg0.cfr_renamed_152.cfr_renamed_2875();
        v15 = arg0;
        v15.cfr_renamed_86.cfr_renamed_2797(v15.cfr_renamed_107);
        var8_10 = null;
        if (var6_6.cfr_renamed_324() == 11) {
            var8_10 = this.cfr_renamed_3164(arg0, var6_6.cfr_renamed_2573());
            var6_6 = var4_4.cfr_renamed_3105();
            v16 = var8_10;
        } else {
            arg0.cfr_renamed_86.cfr_renamed_2798();
            v16 = var8_10;
        }
        if (v16 == null || var8_10.cfr_renamed_29()) {
            arg0.cfr_renamed_132 = false;
        }
        if (var6_6.cfr_renamed_324() == 22) {
            this.cfr_renamed_3161(arg0, var6_6.cfr_renamed_2573());
            var6_6 = var4_4.cfr_renamed_3105();
        }
        if (var6_6.cfr_renamed_324() == 12) {
            this.cfr_renamed_3174(arg0, var6_6.cfr_renamed_2573());
            v17 = var6_6 = var4_4.cfr_renamed_3105();
        } else {
            arg0.cfr_renamed_86.cfr_renamed_2956();
            v17 = var6_6;
        }
        if (v17.cfr_renamed_324() == 13) {
            v18 = var4_4;
            this.cfr_renamed_3166(arg0, var6_6.cfr_renamed_2573());
            sprzsc.cfr_renamed_2689(v18.cfr_renamed_2881(), arg0.cfr_renamed_0.cfr_renamed_2882());
            var6_6 = v18.cfr_renamed_3105();
        }
        if (var6_6.cfr_renamed_324() == 14) {
            if (var6_6.cfr_renamed_2573().length != 0) {
                throw new spryad(50);
            }
        } else {
            throw new spryad(10);
        }
        var4_4.cfr_renamed_2881().cfr_renamed_2883();
        v19 = arg0.cfr_renamed_152.cfr_renamed_3038();
        var9_11 /* !! */  = (byte[])v19;
        if (v19 != null) {
            var10_12 /* !! */  = sprerc.cfr_renamed_3109((Vector)var9_11 /* !! */ );
            var4_4.cfr_renamed_3108((short)23, var10_12 /* !! */ );
        }
        if (arg0.cfr_renamed_0 != null) {
            v20 = arg0;
            v20.cfr_renamed_79 = v20.cfr_renamed_1.cfr_renamed_3039(arg0.cfr_renamed_0);
            var10_12 /* !! */  = null;
            if (v20.cfr_renamed_79 != null) {
                var10_12 /* !! */  = (byte[])arg0.cfr_renamed_79.cfr_renamed_2141();
            }
            if (var10_12 /* !! */  == null) {
                var10_12 /* !! */  = (byte[])sprbbd.cfr_renamed_4;
            }
            var11_13 = sprerc.cfr_renamed_3110((sprbbd)var10_12 /* !! */ );
            var4_4.cfr_renamed_3108((short)11, (byte[])var11_13);
        }
        v21 = arg0;
        if (arg0.cfr_renamed_79 != null) {
            v21.cfr_renamed_86.cfr_renamed_2796(arg0.cfr_renamed_79);
            v22 = this;
        } else {
            v21.cfr_renamed_86.cfr_renamed_2845();
            v22 = this;
        }
        var10_12 /* !! */  = v22.cfr_renamed_3175(arg0);
        v23 = var4_4;
        v23.cfr_renamed_3108((short)16, var10_12 /* !! */ );
        v24 = arg0;
        sprkxc.cfr_renamed_2858(arg0.cfr_renamed_107, v24.cfr_renamed_86);
        arg1.cfr_renamed_3115(v24.cfr_renamed_152.cfr_renamed_2471());
        var11_13 = v23.cfr_renamed_2861();
        if (arg0.cfr_renamed_79 != null && arg0.cfr_renamed_79 instanceof sprzk) {
            var12_14 = (sprzk)arg0.cfr_renamed_79;
            if (sprzsc.cfr_renamed_2631(arg0.cfr_renamed_107)) {
                var13_15 = var12_14.cfr_renamed_2804();
                if (var13_15 == null) {
                    throw new spryad(80);
                }
                var14_16 = var11_13.cfr_renamed_2821(var13_15.cfr_renamed_2690());
                v25 = var12_14;
            } else {
                var13_15 = null;
                var14_16 = sprkxc.cfr_renamed_2822(arg0.cfr_renamed_107, (sprgg)var11_13, null);
                v25 = var12_14;
            }
            var15_17 = v25.cfr_renamed_2805(var14_16);
            var16_18 = new sprpbd((sprzuc)var13_15, var15_17);
            var17_19 = this.cfr_renamed_3167(arg0, var16_18);
            var4_4.cfr_renamed_3108((short)15, var17_19);
        }
        v26 = arg0;
        var12_14 = sprzsc.cfr_renamed_2664(v26.cfr_renamed_107, "client finished", sprkxc.cfr_renamed_2822(arg0.cfr_renamed_107, var4_4.cfr_renamed_2881(), null));
        var4_4.cfr_renamed_3108((short)20, (byte[])var12_14);
        if (!v26.cfr_renamed_96) ** GOTO lbl159
        var6_6 = var4_4.cfr_renamed_3105();
        if (var6_6.cfr_renamed_324() == 4) {
            v27 = arg0;
            v28 = v27;
            this.cfr_renamed_3163(v27, var6_6.cfr_renamed_2573());
        } else {
            throw new spryad(10);
lbl159:
            // 1 sources

            v28 = arg0;
        }
        var13_15 = sprzsc.cfr_renamed_2664(v28.cfr_renamed_107, "server finished", sprkxc.cfr_renamed_2822(arg0.cfr_renamed_107, var4_4.cfr_renamed_2881(), null));
        v29 = var4_4;
        this.cfr_renamed_3119(v29.cfr_renamed_3117((short)20), (byte[])var13_15);
        v29.cfr_renamed_3120();
        if (arg0.cfr_renamed_137 != null) {
            v30 = arg0;
            v30.cfr_renamed_102 = new sprsbd().cfr_renamed_2935(var3_3.cfr_renamed_4).cfr_renamed_2936(var3_3.cfr_renamed_119).cfr_renamed_2937(var3_3.cfr_renamed_152).cfr_renamed_2938((sprbbd)var8_10).cfr_renamed_1451();
            arg0.cfr_renamed_137 = sprzsc.cfr_renamed_2724(v30.cfr_renamed_137.cfr_renamed_2811(), arg0.cfr_renamed_102);
            v30.cfr_renamed_107.cfr_renamed_2940(arg0.cfr_renamed_137);
        }
        arg0.cfr_renamed_152.cfr_renamed_2941();
        return new sprmxc(arg1);
    }

    public void cfr_renamed_3174(sprquc arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream = new ByteArrayInputStream(arg1);
        arg0.cfr_renamed_86.cfr_renamed_2789(byteArrayInputStream2);
        sprkxc.cfr_renamed_2674(byteArrayInputStream2);
    }

    public void cfr_renamed_3173(sprquc arg0) {
        if (arg0.cfr_renamed_102 != null) {
            arg0.cfr_renamed_102.cfr_renamed_722();
            arg0.cfr_renamed_102 = null;
        }
        if (arg0.cfr_renamed_137 != null) {
            arg0.cfr_renamed_137.cfr_renamed_2812();
            arg0.cfr_renamed_137 = null;
        }
    }

    public byte[] cfr_renamed_3175(sprquc arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg0.cfr_renamed_86.cfr_renamed_2801(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }
}

