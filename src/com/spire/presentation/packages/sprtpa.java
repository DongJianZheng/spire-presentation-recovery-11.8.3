/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprdae;
import com.spire.presentation.packages.spreva;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhsa;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmpd;
import com.spire.presentation.packages.sprnua;
import com.spire.presentation.packages.sprqpe;
import com.spire.presentation.packages.sprrua;
import com.spire.presentation.packages.sprtny;
import com.spire.presentation.packages.sprtse;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprtpa {
    public sprdae cfr_renamed_3;
    public sprbva cfr_renamed_4;

    public String cfr_renamed_647() {
        if (this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_647() != null) {
            int n;
            StringBuffer stringBuffer = new StringBuffer();
            sprtse sprtse2 = this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_647();
            int n2 = n = 0;
            while (n2 != sprtse2.cfr_renamed_84()) {
                stringBuffer.append(sprtse2.cfr_renamed_649(n++).cfr_renamed_314());
                n2 = n;
            }
            return stringBuffer.toString();
        }
        return null;
    }

    public sprtpa(InputStream arg0) throws sprrua, IOException {
        this(sprtpa.cfr_renamed_650(arg0));
    }

    public sprqpe cfr_renamed_651() {
        if (this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_651() != null) {
            return new sprqpe(this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_651());
        }
        return null;
    }

    public int cfr_renamed_648() {
        return this.cfr_renamed_3.cfr_renamed_648().cfr_renamed_648().intValue();
    }

    public sprtpa(sprdae arg0) throws sprrua, IOException {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3.cfr_renamed_652() != null) {
            sprtpa sprtpa2 = this;
            sprtpa2.cfr_renamed_4 = new sprbva(arg0.cfr_renamed_652());
        }
    }

    public void cfr_renamed_653(sprnua arg0) throws sprrua {
        sprbva sprbva2 = this.cfr_renamed_652();
        if (sprbva2 != null) {
            sprhsa sprhsa2 = sprbva2.cfr_renamed_577();
            if (arg0.cfr_renamed_596() != null && !arg0.cfr_renamed_596().equals(sprhsa2.cfr_renamed_596())) {
                throw new spreva(sprtny.cfr_renamed_9("wsvfjxvs%ujxqwlxv6rdjxb6kyku`6swic`8"));
            }
            if (this.cfr_renamed_648() != 0 && this.cfr_renamed_648() != 1) {
                throw new spreva(sprmpd.cfr_renamed_9("[MBA\u000fW[EBT\u000fP@OJJ\u000fB@QA@\u000fMA\u0004IEFHJ@\u000fVJUZA\\P\u0001"));
            }
            if (!sprzra.cfr_renamed_559(arg0.cfr_renamed_581(), sprhsa2.cfr_renamed_581())) {
                throw new spreva(sprtny.cfr_renamed_9("wsvfjxvs%pjd%rlpcswskb%{`evwbs%\u007fhfw\u007fkb%rlq`eq8"));
            }
            if (!sprhsa2.cfr_renamed_591().equals(arg0.cfr_renamed_591())) {
                throw new spreva(sprmpd.cfr_renamed_9("]A\\T@J\\A\u000fB@V\u000f@FBIA]AAP\u000fIJW\\EHA\u000fMBT]MAP\u000fECC@VFPGI\u0001"));
            }
            sprbva sprbva3 = sprbva2;
            sprche sprche2 = sprbva3.cfr_renamed_619().cfr_renamed_625(sprm.cfr_renamed_105);
            sprche sprche3 = sprbva3.cfr_renamed_619().cfr_renamed_625(sprm.cfr_renamed_3);
            if (sprche2 == null && sprche3 == null) {
                throw new spreva(sprtny.cfr_renamed_9("xj6v\u007fbxlxb6fswblpludb`6dbqdltpb`6ud`e`xq8"));
            }
            if (sprche2 == null || sprche3 != null) {
                // empty if block
            }
            if (arg0.cfr_renamed_608() != null && !arg0.cfr_renamed_608().equals(sprhsa2.cfr_renamed_598())) {
                throw new spreva(sprmpd.cfr_renamed_9("{wn\u0004_KCML]\u000fS]KAC\u000fB@V\u000fVJUZA\\P\u0001"));
            }
        } else if (this.cfr_renamed_648() == 0 || this.cfr_renamed_648() == 1) {
            throw new spreva(sprtny.cfr_renamed_9("xj6q\u007fhs%eqwhf%bj}`x%pjckr%wkr%yks%s}f`uqsa8"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtpa(byte[] byArray) throws sprrua, IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 2 << 1;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprdae cfr_renamed_650(InputStream arg0) throws IOException, sprrua {
        try {
            return sprdae.cfr_renamed_23(new sprgle(arg0).cfr_renamed_24());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprrua(new StringBuilder().insert(0, sprmpd.cfr_renamed_9("INHIK]IJ@\u000fPFIJW[EBT\u000fVJW_KAWJ\u001e\u000f")).append(illegalArgumentException).toString(), illegalArgumentException);
        }
        catch (ClassCastException classCastException) {
            throw new sprrua(new StringBuilder().insert(0, sprtny.cfr_renamed_9("hwipjdhsa6q\u007fhsvbd{u6wsvfjxvs?6")).append(classCastException).toString(), classCastException);
        }
    }

    public sprbva cfr_renamed_652() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }
}

