/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbn;
import com.spire.presentation.packages.sprccn;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdfn;
import com.spire.presentation.packages.sprdk;
import com.spire.presentation.packages.sprgcn;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprmfn;
import com.spire.presentation.packages.sprmxm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprolha;
import com.spire.presentation.packages.sproxm;
import com.spire.presentation.packages.sprozm;
import com.spire.presentation.packages.sprpcn;
import com.spire.presentation.packages.sprrfn;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprtvm;
import com.spire.presentation.packages.sprucn;
import com.spire.presentation.packages.sprwbn;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxzm;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprden {
    private final byte[][] cfr_renamed_2;
    private final InputStream cfr_renamed_3;
    private final int cfr_renamed_4;

    public sprrvm cfr_renamed_4789() throws IOException {
        sprden sprden2;
        int n = this.cfr_renamed_3.read();
        if (n < 0) {
            return new sprrvm(0);
        }
        sprrvm sprrvm2 = new sprrvm();
        do {
            sprco sprco2;
            if ((sprco2 = this.cfr_renamed_11482(n)) instanceof sprdk) {
                sprrvm2.cfr_renamed_5004(((sprdk)((Object)sprco2)).cfr_renamed_2414());
                sprden2 = this;
                continue;
            }
            sprrvm2.cfr_renamed_5004(sprco2.cfr_renamed_119());
            sprden2 = this;
        } while ((n = sprden2.cfr_renamed_3.read()) >= 0);
        return sprrvm2;
    }

    public sprxgf cfr_renamed_11274(int arg0, int arg1, boolean arg2) throws IOException {
        if (!arg2) {
            byte[] byArray = ((sprmfn)this.cfr_renamed_3).cfr_renamed_954();
            return sprnvm.cfr_renamed_11478(arg0, arg1, byArray);
        }
        sprrvm sprrvm2 = this.cfr_renamed_4789();
        return sprnvm.cfr_renamed_11480(arg0, arg1, sprrvm2);
    }

    public sprxgf cfr_renamed_11428(int arg0, int arg1) throws IOException {
        sprrvm sprrvm2 = this.cfr_renamed_4789();
        return sprnvm.cfr_renamed_11479(arg0, arg1, sprrvm2);
    }

    public sprco cfr_renamed_11427(int arg0) throws IOException {
        switch (arg0) {
            case 3: {
                return new sprrfn(this);
            }
            case 4: {
                return new sproxm(this);
            }
            case 8: {
                return new sprpcn(this);
            }
            case 16: {
                return new sprdfn(this);
            }
            case 17: {
                return new sprccn(this);
            }
        }
        throw new sprign(new StringBuilder().insert(0, sprwff.cfr_renamed_9("guyu}l|;P^@;}yx~qo2~|x}n|owiw\u007f(;\"c")).append(Integer.toHexString(arg0)).toString());
    }

    public sprco cfr_renamed_24() throws IOException {
        int n = this.cfr_renamed_3.read();
        if (n < 0) {
            return null;
        }
        return this.cfr_renamed_11482(n);
    }

    public sprco cfr_renamed_11483(int arg0, sprmfn arg1) throws IOException {
        switch (arg0) {
            case 3: {
                return new sprgcn(arg1);
            }
            case 8: {
                throw new sprign(sprolha.cfr_renamed_9("y{hfnm}oo#qvow<vof<`smownv\u007fwyg<fr`sgum{#4pyf<[25%3<;22$*"));
            }
            case 4: {
                return new sprxzm(arg1);
            }
            case 17: {
                throw new sprign(sprwff.cfr_renamed_9("a~cnwuq~a;\u007fnao2na~2x}uao`nqow\u007f2~|x}\u007f{uu;:hw~2C<-++2#<\"<*=#<*\"5#2"));
            }
            case 16: {
                throw new sprign(sprolha.cfr_renamed_9("ofhp<niph#ipy#\u007flrphqi`hfx#ym\u007flxjrd<+ofy#D-*:,#$--2223;22.--*"));
            }
        }
        try {
            return sprrzm.cfr_renamed_11484(arg0, arg1, this.cfr_renamed_2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprign(sprwff.cfr_renamed_9("x}i`nbow\u007f2hfiwz\u007f;v~f~qow\u007f"), illegalArgumentException);
        }
    }

    public sprden(InputStream arg0, int arg1) {
        this(arg0, arg1, new byte[11][]);
    }

    private /* synthetic */ void cfr_renamed_4916(boolean arg0) {
        if (this.cfr_renamed_3 instanceof sprozm) {
            ((sprozm)this.cfr_renamed_3).cfr_renamed_4610(arg0);
        }
    }

    public sprju cfr_renamed_11272() throws IOException {
        int n = this.cfr_renamed_3.read();
        if (n < 0) {
            return null;
        }
        int n2 = n & 0xC0;
        if (0 == n2) {
            throw new sprign(sprolha.cfr_renamed_9("rl<w}d{fx#savf\u007fw<esvrg"));
        }
        return (sprju)this.cfr_renamed_11482(n);
    }

    public sprco cfr_renamed_11267(int arg0) throws IOException {
        if (arg0 < 0 || arg0 > 30) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwff.cfr_renamed_9("{udz~rv;gu{mwiaz~;fzu;|n\u007fywi(;")).append(arg0).toString());
        }
        int n = this.cfr_renamed_3.read();
        if (n < 0) {
            return null;
        }
        if ((n & 0xFFFFFFDF) != arg0) {
            throw new IOException(new StringBuilder().insert(0, sprolha.cfr_renamed_9("vrfdsy`hfx#ugymhjzjyq<fr`svrwyqyg&#")).append(n).toString());
        }
        return this.cfr_renamed_11482(n);
    }

    public sprco cfr_renamed_11482(int arg0) throws IOException {
        sprden sprden2 = this;
        sprden2.cfr_renamed_4916(false);
        int n = sprrzm.cfr_renamed_4917(sprden2.cfr_renamed_3, arg0);
        int n2 = sprrzm.cfr_renamed_11485(sprden2.cfr_renamed_3, this.cfr_renamed_4, n == 3 || n == 4 || n == 16 || n == 17 || n == 8);
        if (n2 < 0) {
            if (0 == (arg0 & 0x20)) {
                throw new IOException(sprwff.cfr_renamed_9("{uv~tr|rf~?wwuuoz;bi{v{o{mw;wuqtvr||2~|x}n|owiw\u007f"));
            }
            sprden sprden3 = this;
            sprozm sprozm2 = new sprozm(sprden3.cfr_renamed_3, sprden3.cfr_renamed_4);
            sprden sprden4 = this;
            sprden sprden5 = new sprden(sprozm2, sprden4.cfr_renamed_4, sprden4.cfr_renamed_2);
            int n3 = arg0 & 0xC0;
            if (0 != n3) {
                return new sprtvm(n3, n, sprden5);
            }
            return sprden5.cfr_renamed_11427(n);
        }
        sprmfn sprmfn2 = new sprmfn(this.cfr_renamed_3, n2, this.cfr_renamed_4);
        if (0 == (arg0 & 0xE0)) {
            return this.cfr_renamed_11483(n, sprmfn2);
        }
        sprmfn sprmfn3 = sprmfn2;
        sprden sprden6 = new sprden(sprmfn3, sprmfn3.cfr_renamed_4584(), this.cfr_renamed_2);
        int n4 = arg0 & 0xC0;
        if (0 != n4) {
            boolean bl = (arg0 & 0x20) != 0;
            return new sprucn(n4, n, bl, sprden6);
        }
        return sprden6.cfr_renamed_11268(n);
    }

    /*
     * WARNING - void declaration
     */
    public sprden(InputStream inputStream, int n, byte[][] byArray) {
        void arg1;
        void arg0;
        sprden sprden2 = this;
        this.cfr_renamed_3 = arg0;
        sprden2.cfr_renamed_4 = arg1;
        sprden2.cfr_renamed_2 = byArray;
    }

    public sprco cfr_renamed_11268(int arg0) throws IOException {
        switch (arg0) {
            case 3: {
                return new sprrfn(this);
            }
            case 8: {
                return new sprpcn(this);
            }
            case 4: {
                return new sproxm(this);
            }
            case 17: {
                return new sprbbn(this);
            }
            case 16: {
                return new sprmxm(this);
            }
        }
        throw new sprign(new StringBuilder().insert(0, sprolha.cfr_renamed_9("vrhrlkm<GP#savf\u007fw<fr`svrwyqyg&#,{")).append(Integer.toHexString(arg0)).toString());
    }

    public sprden(InputStream arg0) {
        InputStream inputStream = arg0;
        this(inputStream, sprwbn.cfr_renamed_4582(inputStream));
    }

    public sprco cfr_renamed_11269(int n) throws IOException {
        sprden sprden2 = this;
        return sprden2.cfr_renamed_11483(n, (sprmfn)sprden2.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprden(byte[] byArray) {
        this(new ByteArrayInputStream((byte[])arg0), ((void)arg0).length);
        void arg0;
    }
}

