/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbc;
import com.spire.presentation.packages.sprexc;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.sprkvc;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprtwc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprgcd {
    private long cfr_renamed_272;
    private sprsc cfr_renamed_145;
    private int cfr_renamed_114;
    private sprpxc cfr_renamed_96;
    private sprkxc cfr_renamed_105;
    private int cfr_renamed_137;
    private boolean cfr_renamed_79;
    private sprgg cfr_renamed_107;
    private sprpxc cfr_renamed_132;
    private ByteArrayOutputStream cfr_renamed_102;
    private sprbc cfr_renamed_93;
    private sprmc cfr_renamed_86;
    private static int cfr_renamed_152 = 16384;
    private InputStream cfr_renamed_112;
    private sprmc cfr_renamed_119;
    private OutputStream cfr_renamed_91;
    private long cfr_renamed_0;
    private sprbc cfr_renamed_1;
    private int cfr_renamed_2;
    private sprmc cfr_renamed_3;
    private sprbc cfr_renamed_4;

    public sprpxc cfr_renamed_3079() {
        return this.cfr_renamed_96;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2797(sprsc sprsc2) {
        void arg0;
        sprgcd sprgcd2 = this;
        sprgcd2.cfr_renamed_145 = sprsc2;
        sprgcd2.cfr_renamed_107 = new sprkvc();
        this.cfr_renamed_107.cfr_renamed_2797((sprsc)arg0);
    }

    public void cfr_renamed_2838(int arg0) {
        sprgcd sprgcd2 = this;
        sprgcd2.cfr_renamed_137 = arg0;
        sprgcd2.cfr_renamed_114 = sprgcd2.cfr_renamed_137 + 1024;
        sprgcd2.cfr_renamed_2 = sprgcd2.cfr_renamed_114 + 1024;
    }

    public void cfr_renamed_2825(sprpxc arg0) {
        this.cfr_renamed_96 = arg0;
    }

    public void cfr_renamed_2946(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_107.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public void cfr_renamed_2914() throws IOException {
        if (this.cfr_renamed_4 == null || this.cfr_renamed_3 == null) {
            throw new spryad(40);
        }
        sprgcd sprgcd2 = this;
        sprgcd2.cfr_renamed_93 = sprgcd2.cfr_renamed_4;
        sprgcd2.cfr_renamed_86 = sprgcd2.cfr_renamed_3;
        this.cfr_renamed_0 = 0L;
    }

    private /* synthetic */ byte[] cfr_renamed_3080() {
        sprgcd sprgcd2 = this;
        byte[] byArray = sprgcd2.cfr_renamed_102.toByteArray();
        sprgcd2.cfr_renamed_102.reset();
        return byArray;
    }

    public void cfr_renamed_2827(boolean arg0) {
        this.cfr_renamed_79 = arg0;
    }

    public void cfr_renamed_2921() throws IOException {
        if (this.cfr_renamed_4 == null || this.cfr_renamed_3 == null) {
            throw new spryad(40);
        }
        sprgcd sprgcd2 = this;
        sprgcd2.cfr_renamed_1 = sprgcd2.cfr_renamed_4;
        sprgcd2.cfr_renamed_119 = sprgcd2.cfr_renamed_3;
        this.cfr_renamed_272 = 0L;
    }

    public void cfr_renamed_2907(short arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        byte[] byArray;
        byte[] byArray2;
        byte[] byArray3;
        if (this.cfr_renamed_132 == null) {
            return;
        }
        sprgcd.cfr_renamed_3081(arg0, (short)80);
        sprgcd.cfr_renamed_3082(arg3, this.cfr_renamed_137, (short)80);
        if (arg3 < 1 && arg0 != 23) {
            throw new spryad(80);
        }
        if (arg0 == 22) {
            this.cfr_renamed_2946(arg1, arg2, arg3);
        }
        sprgcd sprgcd2 = this;
        OutputStream outputStream = sprgcd2.cfr_renamed_1.cfr_renamed_2950(sprgcd2.cfr_renamed_102);
        if (outputStream == this.cfr_renamed_102) {
            byArray2 = byArray3 = this.cfr_renamed_119.cfr_renamed_2771(this.cfr_renamed_272++, arg0, arg1, arg2, arg3);
        } else {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(arg1, arg2, arg3);
            outputStream2.flush();
            byArray = this.cfr_renamed_3080();
            sprgcd.cfr_renamed_3082(byArray.length, arg3 + 1024, (short)80);
            byArray2 = byArray3 = this.cfr_renamed_119.cfr_renamed_2771(this.cfr_renamed_272++, arg0, byArray, 0, byArray.length);
        }
        sprgcd.cfr_renamed_3082(byArray2.length, this.cfr_renamed_2, (short)80);
        byArray = new byte[byArray3.length + 5];
        sprzsc.cfr_renamed_2693(arg0, byArray, 0);
        sprzsc.cfr_renamed_2702(this.cfr_renamed_132, byArray, 1);
        sprzsc.cfr_renamed_2679(byArray3.length, byArray, 3);
        System.arraycopy(byArray3, 0, byArray, 5, byArray3.length);
        sprgcd sprgcd3 = this;
        sprgcd3.cfr_renamed_91.write(byArray);
        sprgcd3.cfr_renamed_91.flush();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_2949() {
        try {
            this.cfr_renamed_112.close();
            v0 = this;
            ** GOTO lbl8
        }
        catch (IOException var1_1) {
            try {
                v0 = this;
lbl8:
                // 2 sources

                v0.cfr_renamed_91.close();
                return;
            }
            catch (IOException var1_2) {
                return;
            }
        }
    }

    public void cfr_renamed_2841() {
        this.cfr_renamed_107 = this.cfr_renamed_107.cfr_renamed_2957();
    }

    public sprgcd(sprkxc arg0, InputStream arg1, OutputStream arg2) {
        sprgcd sprgcd2 = this;
        sprgcd sprgcd3 = this;
        sprgcd sprgcd4 = this;
        sprgcd sprgcd5 = this;
        sprgcd sprgcd6 = this;
        sprgcd sprgcd7 = this;
        sprgcd sprgcd8 = this;
        sprgcd sprgcd9 = this;
        this.cfr_renamed_4 = null;
        sprgcd9.cfr_renamed_93 = null;
        sprgcd9.cfr_renamed_1 = null;
        sprgcd8.cfr_renamed_3 = null;
        sprgcd8.cfr_renamed_86 = null;
        sprgcd7.cfr_renamed_119 = null;
        sprgcd7.cfr_renamed_0 = 0L;
        this.cfr_renamed_272 = 0L;
        sprgcd sprgcd10 = this;
        sprgcd10.cfr_renamed_102 = new ByteArrayOutputStream();
        sprgcd6.cfr_renamed_145 = null;
        sprgcd6.cfr_renamed_107 = null;
        sprgcd5.cfr_renamed_96 = null;
        sprgcd5.cfr_renamed_132 = null;
        sprgcd4.cfr_renamed_79 = true;
        sprgcd4.cfr_renamed_105 = arg0;
        sprgcd3.cfr_renamed_112 = arg1;
        sprgcd2.cfr_renamed_91 = arg2;
        sprgcd3.cfr_renamed_93 = new sprtwc();
        sprgcd2.cfr_renamed_1 = sprgcd2.cfr_renamed_93;
        sprgcd2.cfr_renamed_119 = sprgcd2.cfr_renamed_86 = new sprexc(this.cfr_renamed_145);
        sprgcd2.cfr_renamed_2838(cfr_renamed_152);
    }

    public sprgg cfr_renamed_2861() {
        sprgcd sprgcd2 = this;
        sprgg sprgg2 = sprgcd2.cfr_renamed_107;
        sprgcd2.cfr_renamed_107 = sprgcd2.cfr_renamed_107.cfr_renamed_2958();
        return sprgg2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2859(sprbc sprbc2, sprmc sprmc2) {
        void arg0;
        sprgcd sprgcd2 = this;
        sprgcd2.cfr_renamed_4 = arg0;
        sprgcd2.cfr_renamed_3 = sprmc2;
    }

    public sprgg cfr_renamed_2881() {
        return this.cfr_renamed_107;
    }

    public byte[] cfr_renamed_3083(short arg0, InputStream arg1, int arg2) throws IOException {
        sprgcd.cfr_renamed_3082(arg2, this.cfr_renamed_2, (short)22);
        byte[] byArray = sprzsc.cfr_renamed_2632(arg2, arg1);
        byte[] byArray2 = this.cfr_renamed_86.cfr_renamed_2776(this.cfr_renamed_0++, arg0, byArray, 0, byArray.length);
        sprgcd.cfr_renamed_3082(byArray2.length, this.cfr_renamed_114, (short)22);
        sprgcd sprgcd2 = this;
        OutputStream outputStream = sprgcd2.cfr_renamed_93.cfr_renamed_2951(sprgcd2.cfr_renamed_102);
        if (outputStream != this.cfr_renamed_102) {
            outputStream.write(byArray2, 0, byArray2.length);
            outputStream.flush();
            byArray2 = this.cfr_renamed_3080();
        }
        sprgcd.cfr_renamed_3082(byArray2.length, this.cfr_renamed_137, (short)30);
        if (byArray2.length < 1 && arg0 != 23) {
            throw new spryad(47);
        }
        return byArray2;
    }

    /*
     * Unable to fully structure code
     */
    public boolean cfr_renamed_2933() throws IOException {
        block5: {
            var1_1 = sprzsc.cfr_renamed_2670(5, this.cfr_renamed_112);
            if (var1_1 == null) {
                return false;
            }
            var2_2 = sprzsc.cfr_renamed_2762(var1_1, 0);
            sprgcd.cfr_renamed_3081(var2_2, (short)10);
            if (this.cfr_renamed_79) break block5;
            var3_3 = sprzsc.cfr_renamed_2734(var1_1, 1);
            if ((var3_3 & -256) != 768) {
                throw new spryad(47);
            }
            ** GOTO lbl19
        }
        var3_4 = sprzsc.cfr_renamed_2767(var1_1, 1);
        if (this.cfr_renamed_96 == null) {
            v0 = var1_1;
            this.cfr_renamed_96 = var3_4;
        } else {
            if (!var3_4.cfr_renamed_3084(this.cfr_renamed_96)) {
                throw new spryad(47);
            }
lbl19:
            // 3 sources

            v0 = var1_1;
        }
        var3_5 = sprzsc.cfr_renamed_2705(v0, 3);
        v1 = this;
        var4_6 = v1.cfr_renamed_3083(var2_2, v1.cfr_renamed_112, var3_5);
        v1.cfr_renamed_105.cfr_renamed_2922(var2_2, var4_6, 0, var4_6.length);
        return true;
    }

    private static /* synthetic */ void cfr_renamed_3081(short arg0, short arg1) throws IOException {
        switch (arg0) {
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: {
                return;
            }
        }
        throw new spryad(arg1);
    }

    private static /* synthetic */ void cfr_renamed_3082(int arg0, int arg1, short arg2) throws IOException {
        if (arg0 > arg1) {
            throw new spryad(arg2);
        }
    }

    public int cfr_renamed_2917() {
        return this.cfr_renamed_137;
    }

    public void cfr_renamed_2947() throws IOException {
        this.cfr_renamed_91.flush();
    }

    public void cfr_renamed_2826(sprpxc arg0) {
        this.cfr_renamed_132 = arg0;
    }

    public void cfr_renamed_2934() throws IOException {
        block3: {
            block2: {
                sprgcd sprgcd2 = this;
                if (sprgcd2.cfr_renamed_93 != sprgcd2.cfr_renamed_4) break block2;
                sprgcd sprgcd3 = this;
                if (sprgcd3.cfr_renamed_1 != sprgcd3.cfr_renamed_4) break block2;
                sprgcd sprgcd4 = this;
                if (sprgcd4.cfr_renamed_86 != sprgcd4.cfr_renamed_3) break block2;
                sprgcd sprgcd5 = this;
                if (sprgcd5.cfr_renamed_119 == sprgcd5.cfr_renamed_3) break block3;
            }
            throw new spryad(40);
        }
        this.cfr_renamed_4 = null;
        this.cfr_renamed_3 = null;
    }
}

