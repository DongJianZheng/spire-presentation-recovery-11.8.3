/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlfk;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprqyy;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class sprgwe
extends sprvva {
    private final int cfr_renamed_2;
    private final boolean cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_4575() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgwe(boolean bl, int n, byte[] byArray) {
        void arg1;
        void arg0;
        sprgwe sprgwe2 = this;
        this.cfr_renamed_3 = arg0;
        sprgwe2.cfr_renamed_2 = arg1;
        sprgwe2.cfr_renamed_4 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprgwe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgwe) {
            return (sprgwe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprlfk.cfr_renamed_9(")M7M3T2\u00033A6F?W|J2\u0003;F(j2P(B2@9\u0019|")).append(arg0.getClass().getName()).toString());
        }
        try {
            return sprgwe.cfr_renamed_23(sprvva.cfr_renamed_184((byte[])arg0));
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqyy.cfr_renamed_9("ZdUiYa\u001cqS%_jRvHwIfH%SgV`_q\u001ccNjQ%^|H`gX\u0006%")).append(iOException.getMessage()).toString());
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgwe(int n, sprlre sprlre2) {
        int n2;
        void arg0;
        sprgwe sprgwe2 = this;
        sprgwe2.cfr_renamed_2 = arg0;
        sprgwe2.cfr_renamed_3 = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n3 = n2 = 0;
        while (true) {
            void arg1;
            if (n3 == arg1.cfr_renamed_84()) {
                this.cfr_renamed_4 = byteArrayOutputStream.toByteArray();
                return;
            }
            try {
                byteArrayOutputStream.write(((sprkra)arg1.cfr_renamed_576(n2)).cfr_renamed_104("DER"));
            }
            catch (IOException iOException) {
                throw new spraqe(new StringBuilder().insert(0, sprqyy.cfr_renamed_9("QdPcSwQ`X%SgV`_q\u0006%")).append(iOException).toString(), iOException);
            }
            n3 = ++n2;
        }
    }

    public sprgwe(int arg0, byte[] arg1) {
        this(false, arg0, arg1);
    }

    public sprvva cfr_renamed_2456() throws IOException {
        return new sprgle(this.cfr_renamed_4577()).cfr_renamed_24();
    }

    public int cfr_renamed_4576() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_4577() {
        return this.cfr_renamed_4;
    }

    @Override
    public int hashCode() {
        sprgwe sprgwe2;
        int n;
        if (this.cfr_renamed_3) {
            n = 1;
            sprgwe2 = this;
        } else {
            n = 0;
            sprgwe2 = this;
        }
        return n ^ sprgwe2.cfr_renamed_2 ^ sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprgwe)) {
            return false;
        }
        sprgwe sprgwe2 = (sprgwe)arg0;
        return this.cfr_renamed_3 == sprgwe2.cfr_renamed_3 && this.cfr_renamed_2 == sprgwe2.cfr_renamed_2 && sprzra.cfr_renamed_92(this.cfr_renamed_4, sprgwe2.cfr_renamed_4);
    }

    public sprgwe(int arg0, spra arg1) throws IOException {
        this(true, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprgwe(boolean bl, int n, spra spra2) throws IOException {
        void arg1;
        void arg0;
        sprvva sprvva2 = spra2.cfr_renamed_119();
        byte[] byArray = sprvva2.cfr_renamed_104("DER");
        this.cfr_renamed_3 = arg0 != false || sprvva2 instanceof sprere || sprvva2 instanceof sprbne;
        this.cfr_renamed_2 = arg1;
        if (arg0 != false) {
            this.cfr_renamed_4 = byArray;
            return;
        }
        int n2 = this.cfr_renamed_4808(byArray);
        byte[] byArray2 = new byte[byArray.length - n2];
        System.arraycopy(byArray, n2, byArray2, 0, byArray2.length);
        this.cfr_renamed_4 = byArray2;
    }

    public sprvva cfr_renamed_4578(int arg0) throws IOException {
        if (arg0 >= 31) {
            throw new IOException(sprlfk.cfr_renamed_9("V2P)S,L.W9G|W=D|M)N>F."));
        }
        sprgwe sprgwe2 = this;
        byte[] byArray = sprgwe2.cfr_renamed_91();
        byte[] byArray2 = sprgwe2.cfr_renamed_4809(arg0, byArray);
        if ((byArray[0] & 0x20) != 0) {
            byArray2[0] = (byte)(byArray2[0] | 0x20);
        }
        return new sprgle(byArray2).cfr_renamed_24();
    }

    private /* synthetic */ byte[] cfr_renamed_4809(int arg0, byte[] arg1) throws IOException {
        int n = arg1[0] & 0x1F;
        int n2 = 1;
        if (n == 31) {
            n = 0;
            int n3 = arg1[n2] & 0xFF;
            ++n2;
            int n4 = n3;
            if ((n3 & 0x7F) == 0) {
                throw new spraqe(sprqyy.cfr_renamed_9("_jNwIuH`X%OqN`]h\u001c(\u001clRs]iUa\u001cmUbT%Hd[%RpQgYw\u001ccSpRa"));
            }
            int n5 = n4;
            while (n5 >= 0 && (n4 & 0x80) != 0) {
                n |= n4 & 0x7F;
                n <<= 7;
                int n6 = arg1[n2] & 0xFF;
                ++n2;
                n5 = n4 = n6;
            }
            n |= n4 & 0x7F;
        }
        byte[] byArray = new byte[arg1.length - n2 + 1];
        System.arraycopy(arg1, n2, byArray, 1, byArray.length - 1);
        byArray[0] = (byte)arg0;
        return byArray;
    }

    private /* synthetic */ int cfr_renamed_4808(byte[] arg0) {
        int n = arg0[1] & 0xFF;
        if (n == 128) {
            return 2;
        }
        if (n > 127) {
            int n2 = n & 0x7F;
            if (n2 > 4) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprlfk.cfr_renamed_9("g\u0019q|O9M;W4\u00031L.F|W4B2\u0003h\u0003>Z(F/\u0019|")).append(n2).toString());
            }
            return n2 + 2;
        }
        return 2;
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        return sprcme.cfr_renamed_4585(this.cfr_renamed_2) + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        int n = 64;
        if (this.cfr_renamed_3) {
            n |= 0x20;
        }
        sprgwe sprgwe2 = this;
        arg0.cfr_renamed_4784(n, sprgwe2.cfr_renamed_2, sprgwe2.cfr_renamed_4);
    }
}

