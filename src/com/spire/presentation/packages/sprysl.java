/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdvm;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprhnm;
import com.spire.presentation.packages.sprhvm;
import com.spire.presentation.packages.sprij;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpmfa;
import com.spire.presentation.packages.sprpwl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spruxl;
import com.spire.presentation.packages.sprwy;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.spryzha;
import java.io.IOException;
import java.io.OutputStream;

public class sprysl {
    private sprhnm cfr_renamed_4;

    private /* synthetic */ boolean cfr_renamed_11021(byte[] arg0, sprge arg1) throws IOException {
        OutputStream outputStream;
        sprrvm sprrvm2 = new sprrvm();
        sprge sprge2 = arg1;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4.cfr_renamed_4409());
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4.cfr_renamed_2573());
        OutputStream outputStream2 = outputStream = sprge2.cfr_renamed_470();
        outputStream2.write(new sprcen(sprrvm2).cfr_renamed_104("DER"));
        outputStream2.close();
        return sprge2.cfr_renamed_1435(arg0);
    }

    public boolean cfr_renamed_4416() {
        return this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410().cfr_renamed_593().cfr_renamed_5078(sprwy.cfr_renamed_137);
    }

    public sprdvm cfr_renamed_2573() {
        return this.cfr_renamed_4.cfr_renamed_2573();
    }

    public sprtpl[] cfr_renamed_617() {
        int n;
        sprxpm[] sprxpmArray = this.cfr_renamed_4.cfr_renamed_4414();
        if (sprxpmArray == null) {
            return new sprtpl[0];
        }
        sprtpl[] sprtplArray = new sprtpl[sprxpmArray.length];
        int n2 = n = 0;
        while (n2 != sprxpmArray.length) {
            int n3 = n;
            sprtpl sprtpl2 = new sprtpl(sprxpmArray[n].cfr_renamed_4415());
            sprtplArray[n3] = sprtpl2;
            n2 = ++n;
        }
        return sprtplArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprysl(sprhnm sprhnm2) {
        void arg0;
        if (sprhnm2.cfr_renamed_4409().cfr_renamed_4410() == null) {
            throw new IllegalArgumentException(spryzha.cfr_renamed_9("O'V!z\u001fl\rx\t?\u0002p\u0018?\u001cm\u0003k\t|\u0018z\b"));
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_11022(sprhk arg0) throws sprpwl {
        try {
            sprge sprge2 = arg0.cfr_renamed_5279(this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410());
            sprysl sprysl2 = this;
            return sprysl2.cfr_renamed_11021(sprysl2.cfr_renamed_4.cfr_renamed_4413().cfr_renamed_81(), sprge2);
        }
        catch (Exception exception) {
            throw new sprpwl(new StringBuilder().insert(0, sprpmfa.cfr_renamed_9("}7i;d<(-gy~<z0n (*a>f8|,z<2y")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprhnm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprddm cfr_renamed_11023() {
        return this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410();
    }

    /*
     * WARNING - void declaration
     */
    public sprysl(spruxl spruxl2) {
        void arg0;
        if (!spruxl2.cfr_renamed_4418()) {
            throw new IllegalArgumentException(spryzha.cfr_renamed_9("O'V!z\u001fl\rx\t?\u0002p\u0018?\u001cm\u0003k\t|\u0018z\b"));
        }
        this.cfr_renamed_4 = arg0.cfr_renamed_568();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_11024(sprij arg0, char[] arg1) throws sprpwl {
        try {
            sprrvm sprrvm2;
            sprsf sprsf2 = arg0.cfr_renamed_7423(this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410(), arg1);
            OutputStream outputStream = sprsf2.cfr_renamed_470();
            sprrvm sprrvm3 = sprrvm2 = new sprrvm();
            sprrvm3.cfr_renamed_5004(this.cfr_renamed_4.cfr_renamed_4409());
            sprrvm3.cfr_renamed_5004(this.cfr_renamed_4.cfr_renamed_2573());
            outputStream.write(new sprcen(sprrvm2).cfr_renamed_104("DER"));
            outputStream.close();
            return sproze.cfr_renamed_559(sprsf2.cfr_renamed_1472(), this.cfr_renamed_4.cfr_renamed_4413().cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new sprpwl(new StringBuilder().insert(0, sprpmfa.cfr_renamed_9("}7i;d<(-gy~<z0n (\u0014I\u001a2y")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprhvm cfr_renamed_4409() {
        return this.cfr_renamed_4.cfr_renamed_4409();
    }
}

