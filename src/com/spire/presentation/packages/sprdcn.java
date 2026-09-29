/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spreip;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgzm;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjsg;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwcn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

public class sprdcn
extends sprszm {
    private byte[] cfr_renamed_4;

    @Override
    public int hashCode() {
        sprdcn sprdcn2 = this;
        sprdcn2.cfr_renamed_11212();
        return super.hashCode();
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        byte[] byArray = this.cfr_renamed_4577();
        if (null != byArray) {
            return sproen.cfr_renamed_11214(arg0, byArray.length);
        }
        return super.cfr_renamed_4612().cfr_renamed_11213(arg0);
    }

    @Override
    public sprgzm cfr_renamed_11215() {
        return ((sprszm)this.cfr_renamed_4612()).cfr_renamed_11215();
    }

    @Override
    public sprco[] cfr_renamed_11216() {
        sprdcn sprdcn2 = this;
        sprdcn2.cfr_renamed_11212();
        return super.cfr_renamed_11216();
    }

    private synchronized /* synthetic */ byte[] cfr_renamed_4577() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private synchronized /* synthetic */ void cfr_renamed_11212() {
        if (null == this.cfr_renamed_4) {
            return;
        }
        sprrzm sprrzm2 = new sprrzm(this.cfr_renamed_4, true);
        try {
            sprrzm sprrzm3 = sprrzm2;
            sprrvm sprrvm2 = sprrzm3.cfr_renamed_4789();
            sprrzm3.close();
            sprdcn sprdcn2 = this;
            sprdcn2.cfr_renamed_4 = (byte[])sprrvm2.cfr_renamed_11217();
            sprdcn2.cfr_renamed_4 = null;
            return;
        }
        catch (IOException iOException) {
            throw new sprhbn(new StringBuilder().insert(0, sprjsg.cfr_renamed_9("<E=B>V<A5\u0004\u0010w\u001f\n`\u001eq")).append(iOException).toString(), iOException);
        }
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        sprdcn sprdcn2 = this;
        sprdcn2.cfr_renamed_11212();
        return super.cfr_renamed_4612();
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        byte[] byArray = this.cfr_renamed_4577();
        if (null != byArray) {
            arg0.cfr_renamed_11219(arg1, 48, byArray);
            return;
        }
        super.cfr_renamed_4612().cfr_renamed_11218(arg0, arg1);
    }

    @Override
    public sproug cfr_renamed_11220() {
        return ((sprszm)this.cfr_renamed_4612()).cfr_renamed_11220();
    }

    @Override
    public sprco[] cfr_renamed_4529() {
        sprdcn sprdcn2 = this;
        sprdcn2.cfr_renamed_11212();
        return super.cfr_renamed_4529();
    }

    @Override
    public int cfr_renamed_84() {
        sprdcn sprdcn2 = this;
        sprdcn2.cfr_renamed_11212();
        return super.cfr_renamed_84();
    }

    @Override
    public Enumeration cfr_renamed_329() {
        byte[] byArray = this.cfr_renamed_4577();
        if (null != byArray) {
            return new sprwcn(byArray);
        }
        return super.cfr_renamed_329();
    }

    @Override
    public spridn cfr_renamed_11221() {
        return ((sprszm)this.cfr_renamed_4612()).cfr_renamed_11221();
    }

    @Override
    public sprco cfr_renamed_85(int n) {
        sprdcn sprdcn2 = this;
        sprdcn2.cfr_renamed_11212();
        return super.cfr_renamed_85(n);
    }

    @Override
    public Iterator<sprco> iterator() {
        sprdcn sprdcn2 = this;
        sprdcn2.cfr_renamed_11212();
        return super.iterator();
    }

    /*
     * WARNING - void declaration
     */
    public sprdcn(byte[] byArray) throws IOException {
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(spreip.cfr_renamed_9("3DzB{EqE3\u0001w@zO{U4Cq\u0001zTxM"));
        }
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprgbf cfr_renamed_11222() {
        return ((sprszm)this.cfr_renamed_4612()).cfr_renamed_11222();
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        sprdcn sprdcn2 = this;
        sprdcn2.cfr_renamed_11212();
        return super.cfr_renamed_4615();
    }
}

