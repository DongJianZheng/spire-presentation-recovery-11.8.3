/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfbf;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.spridf;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprouaa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqnm;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsdm;
import com.spire.presentation.packages.sprsff;
import com.spire.presentation.packages.sprtar;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruem;
import com.spire.presentation.packages.spruqm;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@sprtea
public class sprjze {
    public sprsdm cfr_renamed_3;
    public sprqxe cfr_renamed_4;

    public sprjze(sprsdm arg0) throws sprahf, IOException {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3.cfr_renamed_652() != null) {
            sprjze sprjze2 = this;
            sprjze2.cfr_renamed_4 = new sprqxe(arg0.cfr_renamed_652());
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 3;
        int cfr_ignored_0 = 4 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public String cfr_renamed_647() {
        if (this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_647() != null) {
            int n;
            StringBuffer stringBuffer = new StringBuffer();
            spruqm spruqm2 = this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_647();
            int n2 = n = 0;
            while (n2 != spruqm2.cfr_renamed_84()) {
                stringBuffer.append(spruqm2.cfr_renamed_5303(n++).cfr_renamed_314());
                n2 = n;
            }
            return stringBuffer.toString();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprjze(byte[] byArray) throws sprahf, IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public byte[] cfr_renamed_104(String arg0) throws IOException {
        if ("DL".equals(arg0)) {
            if (this.cfr_renamed_4 == null) {
                return new sprfdn(this.cfr_renamed_3.cfr_renamed_648()).cfr_renamed_104(arg0);
            }
            sprco[] sprcoArray = new sprco[2];
            sprcoArray[0] = this.cfr_renamed_3.cfr_renamed_648();
            sprcoArray[1] = this.cfr_renamed_4.cfr_renamed_637().cfr_renamed_568();
            return new sprfdn(sprcoArray).cfr_renamed_104(arg0);
        }
        return this.cfr_renamed_3.cfr_renamed_104(arg0);
    }

    public sprqnm cfr_renamed_651() {
        if (this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_651() != null) {
            return new sprqnm(this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_651());
        }
        return null;
    }

    public int cfr_renamed_648() {
        return this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_648().intValue();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjze(sprfdn arg0) throws sprahf, IOException {
        try {
            sprjze sprjze2 = this;
            sprjze2.cfr_renamed_3 = sprsdm.cfr_renamed_23(arg0);
            sprjze sprjze3 = this;
            sprjze2.cfr_renamed_4 = new sprqxe(sprlvm.cfr_renamed_23(arg0.cfr_renamed_85(1)));
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprahf(new StringBuilder().insert(0, sprouaa.cfr_renamed_9("A\"@%C1A&HcX*A&_7M.\\c^&_3C-_&\u0016c")).append(illegalArgumentException).toString(), illegalArgumentException);
        }
        catch (ClassCastException classCastException) {
            throw new sprahf(new StringBuilder().insert(0, sprtar.cfr_renamed_9("MnLiO}MjD/TfMjS{AbP/RjS\u007fOaSj\u001a/")).append(classCastException).toString(), classCastException);
        }
    }

    public sprjze(InputStream arg0) throws sprahf, IOException {
        this(sprjze.cfr_renamed_650(arg0));
    }

    public sprqxe cfr_renamed_652() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_5304(sprfbf arg0) throws sprahf {
        sprqxe sprqxe2 = this.cfr_renamed_652();
        if (sprqxe2 != null) {
            spridf spridf2 = sprqxe2.cfr_renamed_577();
            if (arg0.cfr_renamed_596() != null && !arg0.cfr_renamed_596().equals(spridf2.cfr_renamed_596())) {
                throw new sprsff(sprouaa.cfr_renamed_9("^&_3C-_&\f C-X\"E-_c[1C-KcB,B IcZ\"@6Im"));
            }
            if (this.cfr_renamed_648() != 0 && this.cfr_renamed_648() != 1) {
                throw new sprsff(sprtar.cfr_renamed_9("{IbE/S{AbP/T`KjN/F`UaD/Ia\u0000iAfLjD/RjQzE|T!"));
            }
            if (!sproze.cfr_renamed_559(arg0.cfr_renamed_581(), spridf2.cfr_renamed_581())) {
                throw new sprsff(sprouaa.cfr_renamed_9("^&_3C-_&\f%C1\f'E%J&^&B7\f.I0_\"K&\f*A3^*B7\f'E$I0Xm"));
            }
            if (!spridf2.cfr_renamed_591().cfr_renamed_5078(arg0.cfr_renamed_591())) {
                throw new sprsff(sprtar.cfr_renamed_9("}E|P`N|E/F`R/DfFiE}EaT/MjS|AhE/IbP}IaT/AcG`RfTgM!"));
            }
            sprqxe sprqxe3 = sprqxe2;
            spruem spruem2 = sprqxe3.cfr_renamed_619().cfr_renamed_5299(sprdl.cfr_renamed_578);
            spruem spruem3 = sprqxe3.cfr_renamed_619().cfr_renamed_5299(sprdl.cfr_renamed_1765);
            if (spruem2 == null && spruem3 == null) {
                throw new sprsff(sprouaa.cfr_renamed_9("-Cc_*K-E-KcO&^7E%E M7IcM7X1E!Y7Ic\\1I0I-Xm"));
            }
            if (spruem2 == null || spruem3 != null) {
                // empty if block
            }
            if (arg0.cfr_renamed_608() != null && !arg0.cfr_renamed_608().cfr_renamed_5078(spridf2.cfr_renamed_598())) {
                throw new sprsff(sprtar.cfr_renamed_9("[sN\u0000\u007fOcIlY/W}OaG/F`R/RjQzE|T!"));
            }
        } else if (this.cfr_renamed_648() == 0 || this.cfr_renamed_648() == 1) {
            throw new sprsff(sprouaa.cfr_renamed_9("-CcX*A&\f0X\"A3\f7C(I-\f%C6B'\f\"B'\f,B&\f&T3I X&Hm"));
        }
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprsdm cfr_renamed_650(InputStream arg0) throws IOException, sprahf {
        try {
            return sprsdm.cfr_renamed_23(new sprrzm(arg0).cfr_renamed_24());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprahf(new StringBuilder().insert(0, sprtar.cfr_renamed_9("MnLiO}MjD/TfMjS{AbP/RjS\u007fOaSj\u001a/")).append(illegalArgumentException).toString(), illegalArgumentException);
        }
        catch (ClassCastException classCastException) {
            throw new sprahf(new StringBuilder().insert(0, sprouaa.cfr_renamed_9("A\"@%C1A&HcX*A&_7M.\\c^&_3C-_&\u0016c")).append(classCastException).toString(), classCastException);
        }
    }
}

