/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbcd;
import com.spire.presentation.packages.sprbuc;
import com.spire.presentation.packages.sprcrc;
import com.spire.presentation.packages.sprfcd;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprhj;
import com.spire.presentation.packages.sprjmo;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprmzc;
import com.spire.presentation.packages.sprnkea;
import com.spire.presentation.packages.sproc;
import com.spire.presentation.packages.sprpbd;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprqi;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.sprvyc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;

public class spryuc
extends sprkxc {
    public short cfr_renamed_119;
    public sproc cfr_renamed_91;
    public sprqi cfr_renamed_0;
    public sprmzc cfr_renamed_1;
    public sprsj cfr_renamed_2;
    public sprgg cfr_renamed_3;
    public sprfrc cfr_renamed_4;

    public void cfr_renamed_2815() throws IOException {
        byte[] byArray = new byte[4];
        sprzsc.cfr_renamed_2693((short)14, byArray, 0);
        sprzsc.cfr_renamed_2654(0, byArray, 1);
        this.cfr_renamed_2816(byArray, 0, byArray.length);
    }

    public void cfr_renamed_2817(sprvyc arg0) throws IOException {
        sprfcd sprfcd2;
        sprfcd sprfcd3 = sprfcd2 = new sprfcd(this, 22);
        arg0.cfr_renamed_2623(sprfcd3);
        sprfcd3.cfr_renamed_2818();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_2819(ByteArrayInputStream arg0) throws IOException {
        boolean bl;
        sprpbd sprpbd2 = sprpbd.cfr_renamed_2628(this.cfr_renamed_2820(), arg0);
        spryuc.cfr_renamed_2674(arg0);
        boolean bl2 = false;
        try {
            sprkc sprkc2;
            byte[] byArray;
            spryuc spryuc2;
            if (sprzsc.cfr_renamed_2631(this.cfr_renamed_2820())) {
                spryuc spryuc3 = this;
                spryuc2 = spryuc3;
                byArray = spryuc3.cfr_renamed_3.cfr_renamed_2821(sprpbd2.cfr_renamed_593().cfr_renamed_2690());
            } else {
                spryuc spryuc4 = this;
                spryuc2 = spryuc4;
                byArray = sprkxc.cfr_renamed_2822(spryuc4.cfr_renamed_2820(), this.cfr_renamed_3, null);
            }
            sprhgb sprhgb2 = sprhcd.cfr_renamed_1531(spryuc2.cfr_renamed_152.cfr_renamed_2720(0).cfr_renamed_1489());
            sprkc sprkc3 = sprkc2 = sprzsc.cfr_renamed_2765(this.cfr_renamed_119);
            sprkc3.cfr_renamed_2797(this.cfr_renamed_2820());
            bl = bl2 = sprkc3.cfr_renamed_2807(sprpbd2.cfr_renamed_593(), sprpbd2.cfr_renamed_79(), sprhgb2, byArray);
        }
        catch (Exception exception) {
            bl = bl2;
        }
        if (!bl) {
            throw new spryad(51);
        }
    }

    public void cfr_renamed_2823() throws IOException {
        sprfcd sprfcd2 = new sprfcd(this, 2);
        sprpxc sprpxc2 = this.cfr_renamed_0.cfr_renamed_2683();
        if (!sprpxc2.cfr_renamed_2742(this.cfr_renamed_2820().cfr_renamed_2824())) {
            throw new spryad(80);
        }
        spryuc spryuc2 = this;
        spryuc spryuc3 = this;
        spryuc3.cfr_renamed_133.cfr_renamed_2825(sprpxc2);
        spryuc3.cfr_renamed_133.cfr_renamed_2826(sprpxc2);
        spryuc3.cfr_renamed_133.cfr_renamed_2827(true);
        sprpxc sprpxc3 = sprpxc2;
        spryuc3.cfr_renamed_2820().cfr_renamed_2828(sprpxc3);
        sprzsc.cfr_renamed_2749(sprpxc3, sprfcd2);
        sprfcd2.write(spryuc2.cfr_renamed_126.cfr_renamed_93);
        sprzsc.cfr_renamed_2638(sprzsc.cfr_renamed_1, sprfcd2);
        int n = spryuc2.cfr_renamed_0.cfr_renamed_2829();
        if (!sprzra.cfr_renamed_539(this.cfr_renamed_952, n) || n == 0 || n == 255 || !sprzsc.cfr_renamed_2750(n, sprpxc2)) {
            throw new spryad(80);
        }
        spryuc spryuc4 = this;
        spryuc4.cfr_renamed_126.cfr_renamed_4 = n;
        short s = spryuc4.cfr_renamed_0.cfr_renamed_2830();
        if (!sprzra.cfr_renamed_557((short[])spryuc4.cfr_renamed_3, s)) {
            throw new spryad(80);
        }
        spryuc spryuc5 = this;
        spryuc spryuc6 = this;
        spryuc6.cfr_renamed_126.cfr_renamed_119 = s;
        sprzsc.cfr_renamed_2648(n, sprfcd2);
        sprzsc.cfr_renamed_2676(s, sprfcd2);
        spryuc6.cfr_renamed_96 = spryuc5.cfr_renamed_0.cfr_renamed_2831();
        if (spryuc5.cfr_renamed_272) {
            boolean bl;
            byte[] byArray = sprzsc.cfr_renamed_2642(this.cfr_renamed_96, cfr_renamed_86);
            boolean bl2 = bl = null == byArray;
            if (bl) {
                spryuc spryuc7 = this;
                spryuc7.cfr_renamed_96 = sprbcd.cfr_renamed_2832(spryuc7.cfr_renamed_96);
                spryuc7.cfr_renamed_96.put(cfr_renamed_86, spryuc.cfr_renamed_2833(sprzsc.cfr_renamed_1));
            }
        }
        if (this.cfr_renamed_96 != null) {
            this.cfr_renamed_126.cfr_renamed_1 = sprbcd.cfr_renamed_2834(this.cfr_renamed_96);
            spryuc spryuc8 = this;
            this.cfr_renamed_126.cfr_renamed_112 = spryuc8.cfr_renamed_2835((Hashtable)((Object)this.cfr_renamed_4), spryuc8.cfr_renamed_96, (short)80);
            this.cfr_renamed_126.cfr_renamed_0 = sprbcd.cfr_renamed_2836(this.cfr_renamed_96);
            this.cfr_renamed_91 = (sproc)(!this.cfr_renamed_102 && sprzsc.cfr_renamed_2655(this.cfr_renamed_96, sprbcd.cfr_renamed_0, (short)80) ? 1 : 0);
            this.cfr_renamed_724 = !this.cfr_renamed_102 && sprzsc.cfr_renamed_2655(this.cfr_renamed_96, sprkxc.cfr_renamed_84, (short)80);
            spryuc.cfr_renamed_2837(sprfcd2, this.cfr_renamed_96);
        }
        if (this.cfr_renamed_126.cfr_renamed_112 >= 0) {
            int n2 = 1 << 8 + this.cfr_renamed_126.cfr_renamed_112;
            this.cfr_renamed_133.cfr_renamed_2838(n2);
        }
        this.cfr_renamed_126.cfr_renamed_91 = spryuc.cfr_renamed_2839(this.cfr_renamed_2820(), this.cfr_renamed_126.cfr_renamed_2840());
        this.cfr_renamed_126.cfr_renamed_3 = 12;
        sprfcd2.cfr_renamed_2818();
        this.cfr_renamed_133.cfr_renamed_2841();
    }

    public void cfr_renamed_2842(ByteArrayInputStream arg0) throws IOException {
        ByteArrayInputStream byteArrayInputStream = arg0;
        sprbbd sprbbd2 = sprbbd.cfr_renamed_2661(byteArrayInputStream);
        spryuc.cfr_renamed_2674(byteArrayInputStream);
        this.cfr_renamed_2843(sprbbd2);
    }

    @Override
    public sprhj cfr_renamed_2844() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_2843(sprbbd arg0) throws IOException {
        spryuc spryuc2;
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException();
        }
        if (this.cfr_renamed_152 != null) {
            throw new spryad(10);
        }
        this.cfr_renamed_152 = arg0;
        if (arg0.cfr_renamed_29()) {
            spryuc spryuc3 = this;
            spryuc2 = spryuc3;
            spryuc3.cfr_renamed_91.cfr_renamed_2845();
        } else {
            spryuc2 = this;
            spryuc spryuc4 = this;
            this.cfr_renamed_119 = sprzsc.cfr_renamed_2719(arg0, spryuc4.cfr_renamed_2.cfr_renamed_2141());
            spryuc4.cfr_renamed_91.cfr_renamed_2846(arg0);
        }
        spryuc2.cfr_renamed_0.cfr_renamed_2843(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spryuc(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        void arg2;
        void arg1;
        void arg0;
        spryuc spryuc2 = this;
        spryuc spryuc3 = this;
        spryuc spryuc4 = this;
        super((InputStream)arg0, (OutputStream)arg1, (SecureRandom)arg2);
        this.cfr_renamed_0 = null;
        spryuc4.cfr_renamed_1 = null;
        spryuc4.cfr_renamed_91 = null;
        spryuc3.cfr_renamed_2 = null;
        spryuc3.cfr_renamed_4 = null;
        spryuc2.cfr_renamed_119 = (short)-1;
        spryuc2.cfr_renamed_3 = null;
    }

    public void cfr_renamed_2847(ByteArrayInputStream arg0) throws IOException {
        byte[] byArray;
        sprpxc sprpxc2 = sprzsc.cfr_renamed_2657(arg0);
        if (sprpxc2.cfr_renamed_2848()) {
            throw new spryad(47);
        }
        byte[] byArray2 = sprzsc.cfr_renamed_2632(32, arg0);
        if (sprzsc.cfr_renamed_2763(arg0).length > 32) {
            throw new spryad(47);
        }
        int n = sprzsc.cfr_renamed_2660(arg0);
        if (n < 2 || (n & 1) != 0) {
            throw new spryad(50);
        }
        this.cfr_renamed_952 = sprzsc.cfr_renamed_2754(n / 2, arg0);
        short s = sprzsc.cfr_renamed_2630(arg0);
        if (s < 1) {
            throw new spryad(47);
        }
        spryuc spryuc2 = this;
        this.cfr_renamed_3 = sprzsc.cfr_renamed_2711(s, arg0);
        spryuc2.cfr_renamed_4 = spryuc.cfr_renamed_2849(arg0);
        this.cfr_renamed_2820().cfr_renamed_2850(sprpxc2);
        spryuc2.cfr_renamed_0.cfr_renamed_2851(sprpxc2);
        spryuc2.cfr_renamed_126.cfr_renamed_86 = byArray2;
        spryuc2.cfr_renamed_0.cfr_renamed_2852(this.cfr_renamed_952);
        spryuc2.cfr_renamed_0.cfr_renamed_2853((short[])this.cfr_renamed_3);
        if (sprzra.cfr_renamed_539(spryuc2.cfr_renamed_952, 255)) {
            this.cfr_renamed_272 = true;
        }
        if ((byArray = sprzsc.cfr_renamed_2642((Hashtable)((Object)this.cfr_renamed_4), cfr_renamed_86)) != null) {
            this.cfr_renamed_272 = true;
            if (!sprzra.cfr_renamed_559(byArray, spryuc.cfr_renamed_2833(sprzsc.cfr_renamed_1))) {
                throw new spryad(40);
            }
        }
        spryuc spryuc3 = this;
        spryuc3.cfr_renamed_0.cfr_renamed_2854(spryuc3.cfr_renamed_272);
        if (spryuc3.cfr_renamed_4 != null) {
            spryuc spryuc4 = this;
            spryuc4.cfr_renamed_0.cfr_renamed_2855((Hashtable)((Object)spryuc4.cfr_renamed_4));
        }
    }

    public void cfr_renamed_2856(ByteArrayInputStream arg0) throws IOException {
        spryuc spryuc2 = this;
        spryuc spryuc3 = this;
        spryuc3.cfr_renamed_91.cfr_renamed_2857(arg0);
        spryuc.cfr_renamed_2674(arg0);
        spryuc spryuc4 = this;
        spryuc.cfr_renamed_2858(spryuc3.cfr_renamed_2820(), spryuc4.cfr_renamed_91);
        spryuc2.cfr_renamed_133.cfr_renamed_2859(this.cfr_renamed_2844().cfr_renamed_2860(), this.cfr_renamed_2844().cfr_renamed_2471());
        spryuc2.cfr_renamed_3 = spryuc4.cfr_renamed_133.cfr_renamed_2861();
        if (!spryuc2.cfr_renamed_724) {
            this.cfr_renamed_2862();
        }
    }

    public void cfr_renamed_2863(sprqi arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprjmo.cfr_renamed_9("-Zf]YKxXo\\-\u000eiOd@eZ*Lo\u000ed[fB"));
        }
        if (this.cfr_renamed_0 != null) {
            throw new IllegalStateException(sprnkea.cfr_renamed_9("#\u0013g\u0011a\u0002pU$\u0011e\u001c$\u001dj\u001e}Rf\u0017$\u0011e\u001eh\u0017`Rk\u001cg\u0017"));
        }
        spryuc spryuc2 = this;
        spryuc2.cfr_renamed_0 = arg0;
        spryuc spryuc3 = this;
        spryuc2.cfr_renamed_126 = new sprgbd();
        spryuc3.cfr_renamed_126.cfr_renamed_2 = 0;
        spryuc spryuc4 = this;
        spryuc2.cfr_renamed_1 = new sprmzc(spryuc4.cfr_renamed_499, spryuc4.cfr_renamed_126);
        spryuc2.cfr_renamed_126.cfr_renamed_93 = spryuc.cfr_renamed_2864(arg0.cfr_renamed_2865(), this.cfr_renamed_1.cfr_renamed_2866());
        spryuc2.cfr_renamed_0.spr\u2102(this.cfr_renamed_1);
        spryuc2.cfr_renamed_133.cfr_renamed_2797(this.cfr_renamed_1);
        spryuc2.cfr_renamed_133.cfr_renamed_2827(false);
        spryuc2.cfr_renamed_2867();
    }

    public void cfr_renamed_2868(sprfrc arg0) throws IOException {
        sprfcd sprfcd2;
        sprfcd sprfcd3 = sprfcd2 = new sprfcd(this, 13);
        arg0.cfr_renamed_2623(sprfcd3);
        sprfcd3.cfr_renamed_2818();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_2869(short arg0) throws IOException {
        switch (arg0) {
            case 41: {
                if (!sprzsc.cfr_renamed_2665(this.cfr_renamed_2820()) || this.cfr_renamed_4 == null) break;
                this.cfr_renamed_2843(sprbbd.cfr_renamed_4);
                return;
            }
            default: {
                super.cfr_renamed_2869(arg0);
            }
        }
    }

    @Override
    public sprcrc cfr_renamed_2820() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_2870(sprbuc arg0) throws IOException {
        sprfcd sprfcd2;
        if (arg0 == null) {
            throw new spryad(80);
        }
        sprfcd sprfcd3 = sprfcd2 = new sprfcd(this, 4);
        arg0.cfr_renamed_2623(sprfcd3);
        sprfcd3.cfr_renamed_2818();
    }

    @Override
    public void cfr_renamed_2871() {
        spryuc spryuc2 = this;
        spryuc spryuc3 = this;
        super.cfr_renamed_2871();
        spryuc3.cfr_renamed_91 = null;
        spryuc3.cfr_renamed_2 = null;
        spryuc2.cfr_renamed_4 = null;
        spryuc2.cfr_renamed_3 = null;
    }

    public void cfr_renamed_2872(byte[] arg0) throws IOException {
        sprfcd sprfcd2 = new sprfcd(this, 12, arg0.length);
        sprfcd2.write(arg0);
        sprfcd2.cfr_renamed_2818();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_2873(short arg0, byte[] arg1) throws IOException {
        var3_3 = new ByteArrayInputStream(arg1);
        switch (arg0) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                switch (this.cfr_renamed_135) lbl-1000:
                // 2 sources

                {
                    case 0: {
                        if (false) ** GOTO lbl-1000
                        this.cfr_renamed_2847(var3_3);
                        this.cfr_renamed_135 = 1;
                        this.cfr_renamed_2823();
                        this.cfr_renamed_135 = (short)2;
                        var4_4 = this.cfr_renamed_0.cfr_renamed_2418();
                        if (var4_4 != null) {
                            this.cfr_renamed_2874(var4_4);
                        }
                        v0 = this;
                        v0.cfr_renamed_135 = (short)3;
                        v0.cfr_renamed_91 = v0.cfr_renamed_0.cfr_renamed_2875();
                        v0.cfr_renamed_91.cfr_renamed_2797(this.cfr_renamed_2820());
                        v0.cfr_renamed_2 = v0.cfr_renamed_0.cfr_renamed_2876();
                        var5_5 = null;
                        if (this.cfr_renamed_2 == null) {
                            v1 = this;
                            v2 = v1;
                            v1.cfr_renamed_91.cfr_renamed_2798();
                        } else {
                            v3 = this;
                            v2 = v3;
                            v4 = this;
                            v3.cfr_renamed_91.spr\u3027(v4.cfr_renamed_2);
                            var5_5 = v3.cfr_renamed_2.cfr_renamed_2141();
                            v4.cfr_renamed_2877(var5_5);
                        }
                        v2.cfr_renamed_135 = (short)4;
                        if (var5_5 == null || var5_5.cfr_renamed_29()) {
                            this.cfr_renamed_91 = (sproc)false;
                        }
                        if (this.cfr_renamed_91 != false && (var6_6 = this.cfr_renamed_0.cfr_renamed_2878()) != null) {
                            this.cfr_renamed_2817((sprvyc)var6_6);
                        }
                        this.cfr_renamed_135 = (short)5;
                        v5 = this.cfr_renamed_91.cfr_renamed_2879();
                        var6_6 = v5;
                        if (v5 != null) {
                            this.cfr_renamed_2872((byte[])var6_6);
                        }
                        this.cfr_renamed_135 = (short)6;
                        if (this.cfr_renamed_2 != null) {
                            v6 = this;
                            v6.cfr_renamed_4 = v6.cfr_renamed_0.cfr_renamed_2880();
                            if (v6.cfr_renamed_4 != null) {
                                v7 = this;
                                v8 = this;
                                v7.cfr_renamed_91.cfr_renamed_2803(v8.cfr_renamed_4);
                                v8.cfr_renamed_2868(v7.cfr_renamed_4);
                                sprzsc.cfr_renamed_2689(v7.cfr_renamed_133.cfr_renamed_2881(), this.cfr_renamed_4.cfr_renamed_2882());
                            }
                        }
                        this.cfr_renamed_135 = (short)7;
                        this.cfr_renamed_2815();
                        this.cfr_renamed_135 = (short)8;
                        this.cfr_renamed_133.cfr_renamed_2881().cfr_renamed_2883();
                        return;
                    }
                }
                throw new spryad(10);
            }
            case 23: {
                switch (this.cfr_renamed_135) lbl-1000:
                // 2 sources

                {
                    case 8: {
                        if (false) ** GOTO lbl-1000
                        this.cfr_renamed_0.cfr_renamed_2884(spryuc.cfr_renamed_2885(var3_3));
                        this.cfr_renamed_135 = (short)9;
                        return;
                    }
                }
                throw new spryad(10);
            }
            case 11: {
                switch (this.cfr_renamed_135) lbl-1000:
                // 2 sources

                {
                    case 8: {
                        if (false) ** GOTO lbl-1000
                        this.cfr_renamed_0.cfr_renamed_2884(null);
                    }
                    case 9: {
                        if (this.cfr_renamed_4 == null) {
                            throw new spryad(10);
                        }
                        this.cfr_renamed_2842(var3_3);
                        this.cfr_renamed_135 = (short)10;
                        return;
                    }
                }
                throw new spryad(10);
            }
            case 16: {
                switch (this.cfr_renamed_135) lbl-1000:
                // 2 sources

                {
                    case 8: {
                        if (false) ** GOTO lbl-1000
                        this.cfr_renamed_0.cfr_renamed_2884(null);
                    }
                    case 9: {
                        v9 = this;
                        if (this.cfr_renamed_4 != null) ** GOTO lbl89
                        v9.cfr_renamed_91.cfr_renamed_2845();
                        v10 = this;
                        ** GOTO lbl98
lbl89:
                        // 1 sources

                        if (sprzsc.cfr_renamed_2631(v9.cfr_renamed_2820())) {
                            throw new spryad(10);
                        }
                        if (sprzsc.cfr_renamed_2665(this.cfr_renamed_2820())) {
                            if (this.cfr_renamed_152 == null) {
                                throw new spryad(10);
                            }
                        } else {
                            this.cfr_renamed_2843(sprbbd.cfr_renamed_4);
                        }
                    }
                    case 10: {
                        v10 = this;
lbl98:
                        // 2 sources

                        v10.cfr_renamed_2856(var3_3);
                        this.cfr_renamed_135 = (short)11;
                        return;
                    }
                }
                throw new spryad(10);
            }
            case 15: {
                switch (this.cfr_renamed_135) lbl-1000:
                // 2 sources

                {
                    case 11: {
                        if (false) ** GOTO lbl-1000
                        if (!this.cfr_renamed_2886()) {
                            throw new spryad(10);
                        }
                        this.cfr_renamed_2819(var3_3);
                        this.cfr_renamed_135 = (short)12;
                        return;
                    }
                }
                throw new spryad(10);
            }
            case 20: {
                switch (this.cfr_renamed_135) lbl-1000:
                // 2 sources

                {
                    case 11: {
                        if (false) ** GOTO lbl-1000
                        if (this.cfr_renamed_2886()) {
                            throw new spryad(10);
                        }
                    }
                    case 12: {
                        this.cfr_renamed_2887(var3_3);
                        this.cfr_renamed_135 = (short)13;
                        if (this.cfr_renamed_724) {
                            v11 = this;
                            v11.cfr_renamed_2870(v11.cfr_renamed_0.cfr_renamed_2888());
                            v11.cfr_renamed_2862();
                        }
                        this.cfr_renamed_135 = (short)14;
                        this.cfr_renamed_2889();
                        this.cfr_renamed_135 = (short)15;
                        this.cfr_renamed_135 = (short)16;
                        return;
                    }
                }
                throw new spryad(10);
            }
        }
        throw new spryad(10);
    }

    public boolean cfr_renamed_2886() {
        return this.cfr_renamed_119 >= 0 && sprzsc.cfr_renamed_2714(this.cfr_renamed_119);
    }
}

