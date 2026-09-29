/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxg;
import com.spire.presentation.packages.sprbg;
import com.spire.presentation.packages.sprdoe;
import com.spire.presentation.packages.sprgbh;
import com.spire.presentation.packages.sprhxg;
import com.spire.presentation.packages.sprie;
import com.spire.presentation.packages.sprkah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmim;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbg;
import com.spire.presentation.packages.sprsdn;
import com.spire.presentation.packages.sprti;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvh;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprxam;
import java.io.EOFException;
import java.io.InputStream;

public class sprgzg
extends sprkah {
    public sprmim cfr_renamed_4;

    public InputStream cfr_renamed_7700(sprie arg0) throws sprtqg {
        sprie sprie2 = arg0;
        return this.cfr_renamed_7777(sprie2, sprie2.cfr_renamed_7701());
    }

    private /* synthetic */ boolean cfr_renamed_7778(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 1;
        while (n3 != arg0.length - 2) {
            byte by = arg0[n];
            n2 += by & 0xFF;
            n3 = ++n;
        }
        return arg0[arg0.length - 2] == (byte)(n2 >> 8) && arg0[arg0.length - 1] == (byte)n2;
    }

    @Override
    public int cfr_renamed_593() {
        return this.cfr_renamed_4.cfr_renamed_593();
    }

    public long cfr_renamed_7541() {
        return this.cfr_renamed_4.cfr_renamed_7541();
    }

    private /* synthetic */ InputStream cfr_renamed_7777(sprvh arg0, spraxg arg1) throws sprtqg {
        if (arg1.cfr_renamed_593() != 0) {
            try {
                sprgzg sprgzg2;
                if (this.cfr_renamed_4 instanceof sprojm) {
                    sprojm sprojm2 = (sprojm)((Object)this.cfr_renamed_4);
                    if (sprojm2.cfr_renamed_593() != arg1.cfr_renamed_593()) {
                        throw new sprtqg(sprsdn.cfr_renamed_9("\\\u0012\\\u0004F\u0018AWD\u0012VWN\u0019KWn2n3\u000f\u0016C\u0010@\u0005F\u0003G\u001a\u000f\u001aF\u0004B\u0016[\u0014G"));
                    }
                    sprbg sprbg2 = arg0.cfr_renamed_7567(sprojm2, arg1);
                    sprmam sprmam2 = ((sprxam)((Object)this.cfr_renamed_4)).cfr_renamed_2920();
                    sprgzg2 = this;
                    this.cfr_renamed_3 = new sprmam(sprbg2.cfr_renamed_1447(sprmam2));
                } else {
                    int n;
                    int n2;
                    boolean bl = this.cfr_renamed_4 instanceof sproam;
                    sprbg sprbg3 = arg0.cfr_renamed_7568(bl, arg1.cfr_renamed_593(), arg1.cfr_renamed_1521());
                    sprmam sprmam3 = ((sprxam)((Object)this.cfr_renamed_4)).cfr_renamed_2920();
                    this.cfr_renamed_3 = new sprmam(sprbg3.cfr_renamed_1447(sprmam3));
                    if (bl) {
                        sprgzg sprgzg3 = this;
                        sprgzg3.cfr_renamed_2 = new sprhxg(this.cfr_renamed_3);
                        sprgzg3.cfr_renamed_1 = sprbg3.cfr_renamed_7571();
                        sprgzg sprgzg4 = this;
                        sprgzg3.cfr_renamed_3 = new sprdoe(sprgzg4.cfr_renamed_2, sprgzg4.cfr_renamed_1.cfr_renamed_470());
                    }
                    byte[] byArray = new byte[sprbg3.cfr_renamed_1195()];
                    int n3 = n2 = 0;
                    while (n3 != byArray.length) {
                        n = this.cfr_renamed_3.read();
                        if (n < 0) {
                            throw new EOFException(sprqbg.cfr_renamed_9("}^mHxUkDmT(UfT(_n\u0010{DzUi]&"));
                        }
                        byArray[n2++] = (byte)n;
                        n3 = n2;
                    }
                    sprgzg sprgzg5 = this;
                    n2 = sprgzg5.cfr_renamed_3.read();
                    n = sprgzg5.cfr_renamed_3.read();
                    if (n2 < 0 || n < 0) {
                        throw new EOFException(sprsdn.cfr_renamed_9("Z\u0019J\u000f_\u0012L\u0003J\u0013\u000f\u0012A\u0013\u000f\u0018IW\\\u0003]\u0012N\u001a\u0001"));
                    }
                    sprgzg2 = this;
                }
                return sprgzg2.cfr_renamed_3;
            }
            catch (sprtqg sprtqg2) {
                throw sprtqg2;
            }
            catch (Exception exception) {
                throw new sprtqg(sprqbg.cfr_renamed_9("MHkUxDa_f\u0010{DiB|YfW(TmSzIxDa_f"), exception);
            }
        }
        return ((sprxam)((Object)this.cfr_renamed_4)).cfr_renamed_2920();
    }

    /*
     * WARNING - void declaration
     */
    public sprgzg(sprmim sprmim2, sprxam sprxam2) {
        super((sprxam)arg1);
        void arg1;
        this.cfr_renamed_4 = sprmim2;
    }

    public spraxg cfr_renamed_7779(sprti arg0) throws sprtqg {
        byte[] byArray = arg0.cfr_renamed_7780(this.cfr_renamed_4.cfr_renamed_593(), this.cfr_renamed_4.cfr_renamed_7781());
        if (!this.cfr_renamed_7778(byArray)) {
            throw new sprgbh(sprsdn.cfr_renamed_9("D\u0012VWL\u001fJ\u0014D\u0004Z\u001a\u000f\u0011N\u001eC\u0012K"));
        }
        return new spraxg(byArray[0] & 0xFF, sproze.cfr_renamed_533(byArray, 1, byArray.length - 2));
    }

    public int cfr_renamed_7782(sprti arg0) throws sprtqg {
        if (this.cfr_renamed_4.cfr_renamed_3() == 3) {
            return arg0.cfr_renamed_7780(this.cfr_renamed_4.cfr_renamed_593(), this.cfr_renamed_4.cfr_renamed_7781())[0];
        }
        if (this.cfr_renamed_4.cfr_renamed_3() == 6) {
            return ((sproam)((Object)this.cfr_renamed_4)).cfr_renamed_7783();
        }
        throw new sprwhm(new StringBuilder().insert(0, sprqbg.cfr_renamed_9("efC}@x_zDmT(@iScU|\u0010~UzCa_f\n(")).append(this.cfr_renamed_4.cfr_renamed_3()).toString());
    }

    @Override
    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3();
    }

    /*
     * WARNING - void declaration
     */
    public InputStream cfr_renamed_7784(sprti sprti2) throws sprtqg {
        void arg0;
        sprgzg sprgzg2 = this;
        return sprgzg2.cfr_renamed_7777(sprti2, sprgzg2.cfr_renamed_7779((sprti)arg0));
    }
}

