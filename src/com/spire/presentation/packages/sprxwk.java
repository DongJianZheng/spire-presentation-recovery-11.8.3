/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfx;
import com.spire.presentation.packages.sprguk;
import com.spire.presentation.packages.sprraz;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprvwja;
import java.math.BigInteger;

public class sprxwk
implements sprfx {
    private static final BigInteger cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private final spraq cfr_renamed_119;
    private int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        if (!(arg0 instanceof sprguk)) {
            throw new IllegalArgumentException(sprraz.cfr_renamed_9("u\u001dM\u0001EOV\u0016R\n\u0002\u0000DOC\u001dE\u001aO\nL\u001bQOE\u0006T\nL"));
        }
        sprguk sprguk2 = (sprguk)arg0;
        sprxwk sprxwk2 = this;
        sprguk sprguk3 = sprguk2;
        this.cfr_renamed_119.cfr_renamed_5692(new sprtpk(sprguk2.cfr_renamed_3356()));
        this.cfr_renamed_2 = sprguk3.cfr_renamed_3360();
        sprxwk2.cfr_renamed_152 = sprguk3.cfr_renamed_3361();
        int n = sprguk2.cfr_renamed_3353();
        sprxwk2.cfr_renamed_112 = new byte[n / 8];
        BigInteger bigInteger = cfr_renamed_86.pow(n).multiply(BigInteger.valueOf(this.cfr_renamed_4));
        sprxwk2.cfr_renamed_91 = bigInteger.compareTo(cfr_renamed_1) == 1 ? Integer.MAX_VALUE : bigInteger.intValue();
        this.cfr_renamed_3 = 0;
    }

    static {
        cfr_renamed_1 = BigInteger.valueOf(Integer.MAX_VALUE);
        cfr_renamed_86 = BigInteger.valueOf(2L);
    }

    private /* synthetic */ void cfr_renamed_3511() {
        sprxwk sprxwk2 = this;
        int n = this.cfr_renamed_3 / sprxwk2.cfr_renamed_4 + 1;
        switch (sprxwk2.cfr_renamed_112.length) {
            case 4: {
                this.cfr_renamed_112[0] = (byte)(n >>> 24);
            }
            case 3: {
                sprxwk sprxwk3 = this;
                sprxwk3.cfr_renamed_112[sprxwk3.cfr_renamed_112.length - 3] = (byte)(n >>> 16);
            }
            case 2: {
                sprxwk sprxwk4 = this;
                sprxwk4.cfr_renamed_112[sprxwk4.cfr_renamed_112.length - 2] = (byte)(n >>> 8);
            }
            case 1: {
                sprxwk sprxwk5 = this;
                while (false) {
                }
                sprxwk5.cfr_renamed_112[sprxwk5.cfr_renamed_112.length - 1] = (byte)n;
                break;
            }
            default: {
                throw new IllegalStateException(sprvwja.cfr_renamed_9("7#\u00118\u0012=\r?\u0016(\u0006m\u0011$\u0018(B\"\u0004m\u0001\"\u0017#\u0016(\u0010m\u000b"));
            }
        }
        this.cfr_renamed_119.cfr_renamed_1197(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        sprxwk sprxwk6 = this;
        sprxwk6.cfr_renamed_119.cfr_renamed_1197(sprxwk6.cfr_renamed_112, 0, this.cfr_renamed_112.length);
        sprxwk sprxwk7 = this;
        sprxwk7.cfr_renamed_119.cfr_renamed_1197(sprxwk7.cfr_renamed_152, 0, this.cfr_renamed_152.length);
        sprxwk sprxwk8 = this;
        sprxwk8.cfr_renamed_119.cfr_renamed_1219(sprxwk8.cfr_renamed_0, 0);
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        int n = this.cfr_renamed_3 + arg2;
        if (n < 0 || n >= this.cfr_renamed_91) {
            throw new sprddl(new StringBuilder().insert(0, sprraz.cfr_renamed_9(",W\u001dP\nL\u001b\u0002$f)a;pOO\u000e[OM\u0001N\u0016\u0002\rGOW\u001cG\u000b\u0002\tM\u001d\u0002")).append(this.cfr_renamed_91).append(sprvwja.cfr_renamed_9("m\u00004\u0016(\u0011")).toString());
        }
        sprxwk sprxwk2 = this;
        if (sprxwk2.cfr_renamed_3 % sprxwk2.cfr_renamed_4 == 0) {
            this.cfr_renamed_3511();
        }
        int n2 = arg2;
        sprxwk sprxwk3 = this;
        sprxwk sprxwk4 = this;
        int n3 = sprxwk3.cfr_renamed_3 % sprxwk4.cfr_renamed_4;
        sprxwk sprxwk5 = this;
        int n4 = Math.min(sprxwk3.cfr_renamed_4 - sprxwk5.cfr_renamed_3 % sprxwk5.cfr_renamed_4, n2);
        System.arraycopy(sprxwk4.cfr_renamed_0, n3, arg0, arg1, n4);
        sprxwk3.cfr_renamed_3 += n4;
        arg1 += n4;
        int n5 = n2 -= n4;
        while (n5 > 0) {
            sprxwk sprxwk6 = this;
            sprxwk6.cfr_renamed_3511();
            n4 = Math.min(sprxwk6.cfr_renamed_4, n2);
            System.arraycopy(sprxwk6.cfr_renamed_0, 0, arg0, arg1, n4);
            sprxwk6.cfr_renamed_3 += n4;
            arg1 += n4;
            n5 = n2 -= n4;
        }
        return arg2;
    }

    public sprxwk(spraq arg0) {
        sprxwk sprxwk2 = this;
        this.cfr_renamed_119 = arg0;
        sprxwk2.cfr_renamed_4 = arg0.cfr_renamed_2404();
        sprxwk2.cfr_renamed_0 = new byte[this.cfr_renamed_4];
    }

    @Override
    public spraq cfr_renamed_1472() {
        return this.cfr_renamed_119;
    }
}

