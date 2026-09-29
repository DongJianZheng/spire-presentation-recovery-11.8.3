/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvro;
import com.spire.presentation.packages.sprvva;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class sprhwe
extends sprvva {
    private sprvva cfr_renamed_0;
    private sprooe cfr_renamed_1;
    private sprtzd cfr_renamed_2;
    private sprvva cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhwe(sprtzd sprtzd2, sprooe sprooe2, sprvva sprvva2, int n, sprvva sprvva3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhwe sprhwe2 = this;
        sprhwe sprhwe3 = this;
        sprhwe sprhwe4 = this;
        sprhwe4.cfr_renamed_4800((sprtzd)arg0);
        sprhwe3.cfr_renamed_4801((sprooe)arg1);
        sprhwe3.cfr_renamed_4802((sprvva)arg2);
        sprhwe2.cfr_renamed_4803((int)arg3);
        sprhwe2.cfr_renamed_4804(sprvva3.cfr_renamed_119());
    }

    public sprhwe(sprtzd arg0, sprooe arg1, sprvva arg2, sprhse arg3) {
        this(arg0, arg1, arg2, arg3.cfr_renamed_312(), arg3.cfr_renamed_119());
    }

    @Override
    public int hashCode() {
        int n = 0;
        if (this.cfr_renamed_2 != null) {
            n = this.cfr_renamed_2.hashCode();
        }
        if (this.cfr_renamed_1 != null) {
            n ^= this.cfr_renamed_1.hashCode();
        }
        if (this.cfr_renamed_0 != null) {
            n ^= this.cfr_renamed_0.hashCode();
        }
        return n ^= this.cfr_renamed_3.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprhwe(sprlre sprlre2) {
        void arg0;
        sprhwe sprhwe2 = this;
        int n = 0;
        sprvva sprvva2 = sprhwe2.cfr_renamed_4805(sprlre2, 0);
        if (sprvva2 instanceof sprtzd) {
            this.cfr_renamed_2 = (sprtzd)sprvva2;
            sprvva2 = this.cfr_renamed_4805((sprlre)arg0, ++n);
        }
        if (sprvva2 instanceof sprooe) {
            this.cfr_renamed_1 = (sprooe)sprvva2;
            sprvva2 = this.cfr_renamed_4805((sprlre)arg0, ++n);
        }
        if (!(sprvva2 instanceof sprhse)) {
            this.cfr_renamed_0 = sprvva2;
            sprvva2 = this.cfr_renamed_4805((sprlre)arg0, ++n);
        }
        if (arg0.cfr_renamed_84() != n + 1) {
            throw new IllegalArgumentException(sprvro.cfr_renamed_9("+#286m4(!9-?b9-\"b!#?%("));
        }
        if (!(sprvva2 instanceof sprhse)) {
            throw new IllegalArgumentException(sprjze.cfr_renamed_9("7LYW\u0018D\u001eF\u001d\u0003\u0016A\u0013F\u001aWYE\u0016V\u0017GYJ\u0017\u0003\u000fF\u001aW\u0016QW\u0003*W\u000bV\u001aW\fQ\u001c\u0003\u001dL\u001cP\u0017\u0004\r\u0003\nF\u001cNYW\u0016\u0003\u001bFYL\u001f\u0003\rZ\tFYf\u0001W\u001cQ\u0017B\u0015"));
        }
        sprhse sprhse2 = (sprhse)sprvva2;
        this.cfr_renamed_4803(sprhse2.cfr_renamed_312());
        this.cfr_renamed_3 = sprhse2.cfr_renamed_2456();
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprhwe)) {
            return false;
        }
        if (this == arg0) {
            return true;
        }
        sprhwe sprhwe2 = (sprhwe)arg0;
        if (!(this.cfr_renamed_2 == null || sprhwe2.cfr_renamed_2 != null && sprhwe2.cfr_renamed_2.equals(this.cfr_renamed_2))) {
            return false;
        }
        if (!(this.cfr_renamed_1 == null || sprhwe2.cfr_renamed_1 != null && sprhwe2.cfr_renamed_1.equals(this.cfr_renamed_1))) {
            return false;
        }
        if (!(this.cfr_renamed_0 == null || sprhwe2.cfr_renamed_0 != null && sprhwe2.cfr_renamed_0.equals(this.cfr_renamed_0))) {
            return false;
        }
        return this.cfr_renamed_3.equals(sprhwe2.cfr_renamed_3);
    }

    private /* synthetic */ void cfr_renamed_4800(sprtzd arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public int cfr_renamed_4572() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_4804(sprvva arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.cfr_renamed_2 != null) {
            byteArrayOutputStream.write(this.cfr_renamed_2.cfr_renamed_104("DER"));
        }
        if (this.cfr_renamed_1 != null) {
            byteArrayOutputStream.write(this.cfr_renamed_1.cfr_renamed_104("DER"));
        }
        if (this.cfr_renamed_0 != null) {
            byteArrayOutputStream.write(this.cfr_renamed_0.cfr_renamed_104("DER"));
        }
        sprhwe sprhwe2 = this;
        sprhse sprhse2 = new sprhse(true, sprhwe2.cfr_renamed_4, sprhwe2.cfr_renamed_3);
        byteArrayOutputStream.write(sprhse2.cfr_renamed_104("DER"));
        arg0.cfr_renamed_4784(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        return this.cfr_renamed_91().length;
    }

    public sprvva cfr_renamed_4573() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_4803(int arg0) {
        if (arg0 < 0 || arg0 > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvro.cfr_renamed_9("+#4,.$&m'#!\"&$,*b;#!7(xm")).append(arg0).toString());
        }
        this.cfr_renamed_4 = arg0;
    }

    public sprvva cfr_renamed_4571() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ sprvva cfr_renamed_4805(sprlre arg0, int arg1) {
        if (arg0.cfr_renamed_84() <= arg1) {
            throw new IllegalArgumentException(sprjze.cfr_renamed_9("\rL\u0016\u0003\u001fF\u000e\u0003\u0016A\u0013F\u001aW\n\u0003\u0010MYJ\u0017S\fWYU\u001c@\rL\u000b"));
        }
        return arg0.cfr_renamed_576(arg1).cfr_renamed_119();
    }

    private /* synthetic */ void cfr_renamed_4801(sprooe arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @Override
    public boolean cfr_renamed_4575() {
        return true;
    }

    public sprooe cfr_renamed_4570() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_4802(sprvva arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public sprtzd cfr_renamed_4569() {
        return this.cfr_renamed_2;
    }
}

