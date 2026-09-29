/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprjje;
import com.spire.presentation.packages.sprlzd;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprouaa;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprsee;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruqd;
import com.spire.presentation.packages.sprwue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class sprppd {
    private sprszd cfr_renamed_2;
    private sprsee cfr_renamed_3;
    private static final sprcyd[] cfr_renamed_4 = new sprcyd[0];

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprppd(sprgle arg0) throws IOException {
        try {
            this.cfr_renamed_3 = sprsee.cfr_renamed_23(arg0.cfr_renamed_24());
            if (this.cfr_renamed_3 == null) {
                throw new sprqwd(sprhna.cfr_renamed_9("~\u0019\u007f\u001e|\n~\u001dwXa\u001db\rv\u000bgB3\u0016|Xa\u001db\rv\u000bgXw\u0019g\u00193\u001e|\r}\u001c"));
            }
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_4295().cfr_renamed_3091();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprouaa.cfr_renamed_9(".M/J,^.I'\f1I2Y&_7\u0016c")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, sprhna.cfr_renamed_9("\u0015r\u0014u\u0017a\u0015v\u001c3\nv\tf\u001d`\f)X")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (sprwue sprwue2) {
            throw new sprqwd(new StringBuilder().insert(0, sprouaa.cfr_renamed_9(".M/J,^.I'\f1I2Y&_7\u0016c")).append(sprwue2.getMessage()).toString(), sprwue2);
        }
    }

    public sprmee cfr_renamed_4296() {
        return sprmee.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_4295().cfr_renamed_4296());
    }

    public Set cfr_renamed_665() {
        return sprlzd.cfr_renamed_4234(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprppd(sprsee sprsee2) {
        void arg0;
        sprppd sprppd2 = this;
        sprppd2.cfr_renamed_3 = arg0;
        sprppd2.cfr_renamed_2 = sprsee2.cfr_renamed_4295().cfr_renamed_3091();
    }

    public List cfr_renamed_583() {
        return sprlzd.cfr_renamed_582(this.cfr_renamed_2);
    }

    public int cfr_renamed_569() {
        return this.cfr_renamed_3.cfr_renamed_4295().cfr_renamed_3().cfr_renamed_97().intValue() + 1;
    }

    public sprcyd[] cfr_renamed_626() {
        if (this.cfr_renamed_3.cfr_renamed_4297() != null) {
            sprbne sprbne2 = this.cfr_renamed_3.cfr_renamed_4297().cfr_renamed_626();
            if (sprbne2 != null) {
                int n;
                sprcyd[] sprcydArray = new sprcyd[sprbne2.cfr_renamed_84()];
                int n2 = n = 0;
                while (n2 != sprcydArray.length) {
                    int n3 = n;
                    sprcyd sprcyd2 = new sprcyd(sprcge.cfr_renamed_23(sprbne2.cfr_renamed_85(n)));
                    sprcydArray[n3] = sprcyd2;
                    n2 = ++n;
                }
                return sprcydArray;
            }
            return cfr_renamed_4;
        }
        return cfr_renamed_4;
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_2 != null;
    }

    public byte[] cfr_renamed_79() {
        if (!this.cfr_renamed_4298()) {
            return null;
        }
        return this.cfr_renamed_3.cfr_renamed_4297().cfr_renamed_79().cfr_renamed_81();
    }

    public boolean cfr_renamed_4298() {
        return this.cfr_renamed_3.cfr_renamed_4297() != null;
    }

    public sprtie cfr_renamed_100(sprtzd arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_100(arg0);
        }
        return null;
    }

    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new sprope(byteArrayOutputStream).cfr_renamed_2149(this.cfr_renamed_3);
        return byteArrayOutputStream.toByteArray();
    }

    /*
     * WARNING - void declaration
     */
    public sprppd(byte[] byArray) throws IOException {
        this(new sprgle((byte[])arg0));
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1488(sprja arg0) throws sprbud {
        if (!this.cfr_renamed_4298()) {
            throw new sprbud(sprhna.cfr_renamed_9("r\fg\u001d~\bgXg\u00173\u000ev\nz\u001ejX`\u0011t\u0016r\ff\nvX|\u00163\r}\u000bz\u001f}\u001dwX|\u001ay\u001dp\f"));
        }
        try {
            sprga sprga2;
            sprga sprga3 = sprga2 = arg0.cfr_renamed_578(this.cfr_renamed_3.cfr_renamed_4297().cfr_renamed_89());
            sprga3.cfr_renamed_470().write(this.cfr_renamed_3.cfr_renamed_4295().cfr_renamed_104("DER"));
            return sprga3.cfr_renamed_1435(this.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprbud(new StringBuilder().insert(0, sprouaa.cfr_renamed_9("I;O&\\7E,Bc\\1C I0_*B$\f0E$B\"X6^&\u0016c")).append(exception).toString(), exception);
        }
    }

    public sprtzd cfr_renamed_4299() {
        if (!this.cfr_renamed_4298()) {
            return null;
        }
        return this.cfr_renamed_3.cfr_renamed_4297().cfr_renamed_89().cfr_renamed_593();
    }

    public spruqd[] cfr_renamed_4300() {
        int n;
        sprbne sprbne2 = this.cfr_renamed_3.cfr_renamed_4295().cfr_renamed_4300();
        spruqd[] spruqdArray = new spruqd[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != spruqdArray.length) {
            int n3 = n;
            spruqd spruqd2 = new spruqd(sprjje.cfr_renamed_23(sprbne2.cfr_renamed_85(n)));
            spruqdArray[n3] = spruqd2;
            n2 = ++n;
        }
        return spruqdArray;
    }

    public Set cfr_renamed_662() {
        return sprlzd.cfr_renamed_4236(this.cfr_renamed_2);
    }
}

