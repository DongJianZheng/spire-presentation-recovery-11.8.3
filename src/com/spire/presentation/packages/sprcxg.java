/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxg;
import com.spire.presentation.packages.sprbg;
import com.spire.presentation.packages.sprdoe;
import com.spire.presentation.packages.sprhxg;
import com.spire.presentation.packages.sprjxq;
import com.spire.presentation.packages.sprkah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvh;
import com.spire.presentation.packages.sprvub;
import com.spire.presentation.packages.sprvug;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprxam;
import java.io.EOFException;
import java.io.InputStream;

public class sprcxg
extends sprkah {
    public InputStream cfr_renamed_7566(sprvh arg0, spraxg arg1) throws sprtqg {
        if (this.cfr_renamed_4 instanceof sprojm) {
            sprojm sprojm2 = (sprojm)this.cfr_renamed_4;
            if (sprojm2.cfr_renamed_593() != arg1.cfr_renamed_593()) {
                throw new sprtqg(sprjxq.cfr_renamed_9("5\u001c5\n/\u0016(Y-\u001c?Y'\u0017\"Y\u0007<\u0007=f\u0018*\u001e)\u000b/\r.\u0014f\u0014/\n+\u00182\u001a."));
            }
            sprbg sprbg2 = arg0.cfr_renamed_7567(sprojm2, arg1);
            sprmam sprmam2 = this.cfr_renamed_4.cfr_renamed_2920();
            return new sprmam(sprbg2.cfr_renamed_1447(sprmam2));
        }
        if (this.cfr_renamed_4 instanceof sproam) {
            sproam sproam2 = (sproam)this.cfr_renamed_4;
            if (sproam2.cfr_renamed_3() == 1) {
                sprbg sprbg3 = arg0.cfr_renamed_7568(true, arg1.cfr_renamed_593(), arg1.cfr_renamed_1521());
                return this.cfr_renamed_7569(true, sprbg3);
            }
            if (sproam2.cfr_renamed_3() == 2) {
                sprbg sprbg4 = arg0.cfr_renamed_7570(sproam2, arg1);
                return new sprmam(sprbg4.cfr_renamed_1447(this.cfr_renamed_4.cfr_renamed_2920()));
            }
            throw new sprwhm(new StringBuilder().insert(0, sprvub.cfr_renamed_9(">?\u0018$\u001b!\u0004#\u001f4\u000fq8\u0014\"\u0001/q\u001b0\b:\u000e%K'\u000e#\u00188\u0004?Qq")).append(sproam2.cfr_renamed_3()).toString());
        }
        sprbg sprbg5 = arg0.cfr_renamed_7568(false, arg1.cfr_renamed_593(), arg1.cfr_renamed_1521());
        return this.cfr_renamed_7569(false, sprbg5);
    }

    private /* synthetic */ InputStream cfr_renamed_7569(boolean arg0, sprbg arg1) throws sprtqg {
        try {
            boolean bl;
            int n;
            int n2;
            sprmam sprmam2 = this.cfr_renamed_4.cfr_renamed_2920();
            sprmam2.mark(arg1.cfr_renamed_1195() + 2);
            sprcxg sprcxg2 = this;
            this.cfr_renamed_3 = new sprmam(arg1.cfr_renamed_1447(sprmam2));
            if (arg0) {
                sprcxg sprcxg3 = this;
                sprcxg3.cfr_renamed_2 = new sprhxg(this.cfr_renamed_3);
                sprcxg3.cfr_renamed_1 = arg1.cfr_renamed_7571();
                sprcxg sprcxg4 = this;
                sprcxg3.cfr_renamed_3 = new sprdoe(sprcxg4.cfr_renamed_2, sprcxg4.cfr_renamed_1.cfr_renamed_470());
            }
            byte[] byArray = new byte[arg1.cfr_renamed_1195()];
            int n3 = n2 = 0;
            while (n3 != byArray.length) {
                n = this.cfr_renamed_3.read();
                if (n < 0) {
                    throw new EOFException(sprjxq.cfr_renamed_9("3\u0017#\u00016\u001c%\r#\u001df\u001c(\u001df\u0016 Y5\r4\u001c'\u0014h"));
                }
                byArray[n2++] = (byte)n;
                n3 = n2;
            }
            sprcxg sprcxg5 = this;
            n2 = sprcxg5.cfr_renamed_3.read();
            n = sprcxg5.cfr_renamed_3.read();
            if (n2 < 0 || n < 0) {
                throw new EOFException(sprvub.cfr_renamed_9("$\u00054\u0013!\u000e2\u001f4\u000fq\u000e?\u000fq\u00047K\"\u001f#\u000e0\u0006\u007f"));
            }
            boolean bl2 = byArray[byArray.length - 2] == (byte)n2 && byArray[byArray.length - 1] == (byte)n;
            boolean bl3 = bl = n2 == 0 && n == 0;
            if (!bl2 && !bl) {
                sprmam2.reset();
                throw new sprvug(sprjxq.cfr_renamed_9("\u001d'\r'Y%\u0011#\u001a-Y \u0018/\u0015#\u001dh"));
            }
            return this.cfr_renamed_3;
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprvub.cfr_renamed_9("\u0014\u00132\u000e!\u001f8\u0004?K2\u00194\n%\u0002?\fq\b8\u001b9\u000e#"), exception);
        }
    }

    public sprcxg(sprxam arg0) {
        super(arg0);
    }
}

