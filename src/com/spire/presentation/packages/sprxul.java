/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprgep;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtr;
import com.spire.presentation.packages.sprunl;
import com.spire.presentation.packages.sprus;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxwl;
import com.spire.presentation.packages.spryhs;
import java.io.IOException;

public class sprxul
implements sprtr {
    private sprddm cfr_renamed_1;
    private sprus cfr_renamed_2;
    private sprnbm cfr_renamed_3;
    private sprvhm cfr_renamed_4;

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprxul sprxul2 = (sprxul)arg0;
        sprxul sprxul3 = this;
        sprxul sprxul4 = sprxul2;
        this.cfr_renamed_2 = sprxul2.cfr_renamed_2;
        this.cfr_renamed_1 = sprxul4.cfr_renamed_1;
        sprxul3.cfr_renamed_3 = sprxul4.cfr_renamed_3;
        sprxul3.cfr_renamed_4 = sprxul2.cfr_renamed_4;
    }

    public sprxul(sprus sprus2) {
        this.cfr_renamed_2 = sprus2;
    }

    @Override
    public sprhx cfr_renamed_461() {
        sprxul sprxul2 = new sprxul(this.cfr_renamed_2);
        sprxul sprxul3 = this;
        sprxul2.cfr_renamed_1 = sprxul3.cfr_renamed_1;
        sprxul2.cfr_renamed_3 = sprxul3.cfr_renamed_3;
        sprxul2.cfr_renamed_4 = this.cfr_renamed_4;
        return sprxul2;
    }

    private /* synthetic */ boolean cfr_renamed_10892(sprco arg0) {
        return arg0 == null || arg0 instanceof sprfan;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_10893(sprxwl arg0, sprtpl arg1) throws spreyl {
        if (this.cfr_renamed_3 != null && !this.cfr_renamed_3.equals(arg1.cfr_renamed_102())) {
            throw new spreyl(sprgep.cfr_renamed_9("/}\u001el\u0005~\u0005{\rl\t8\u0005k\u001fm\t8\bw\tkLv\u0003lLu\rl\u000fpLh\rj\tv\u0018"));
        }
        if (this.cfr_renamed_4 != null) {
            try {
                sprtpl sprtpl2;
                sprvhm sprvhm2;
                if (this.cfr_renamed_4.cfr_renamed_593().equals(this.cfr_renamed_1)) {
                    sprvhm2 = this.cfr_renamed_4;
                    sprtpl2 = arg1;
                } else {
                    sprxul sprxul2 = this;
                    sprvhm2 = new sprvhm(sprxul2.cfr_renamed_1, sprxul2.cfr_renamed_4.cfr_renamed_1227());
                    sprtpl2 = arg1;
                }
                if (!sprtpl2.cfr_renamed_7374(this.cfr_renamed_2.cfr_renamed_7463(sprvhm2))) {
                    throw new spreyl(spryhs.cfr_renamed_9("LJ}[fIfLn[j\u000f|FhAn[z]j\u000fa@{\u000fi@}\u000f\u007fZmCfL/DjV/Fa\u000f\u007fN}Ja["));
                }
            }
            catch (sprhjg sprhjg2) {
                throw new spreyl(new StringBuilder().insert(0, sprgep.cfr_renamed_9("9v\rz\u0000}Ll\u00038\u000fj\ty\u0018}Ln\tj\u0005~\u0005}\u001e\"L")).append(sprhjg2.getMessage()).toString(), sprhjg2);
            }
            catch (sprunl sprunl2) {
                throw new spreyl(new StringBuilder().insert(0, spryhs.cfr_renamed_9("ZAnMcJ/[`\u000fyNcFkN{J/\\fHaN{Z}J5\u000f")).append(sprunl2.getMessage()).toString(), sprunl2);
            }
            catch (IOException iOException) {
                throw new spreyl(new StringBuilder().insert(0, sprgep.cfr_renamed_9("M\u0002y\u000et\t8\u0018wLz\u0019q\u0000|Lh\u0019z\u0000q\u000f8\u0007}\u0015\"L")).append(iOException.getMessage()).toString(), iOException);
            }
        }
        sprxul sprxul3 = this;
        sprxul3.cfr_renamed_3 = arg1.cfr_renamed_1485();
        sprxul3.cfr_renamed_4 = arg1.cfr_renamed_1489();
        if (this.cfr_renamed_1 != null) {
            if (!this.cfr_renamed_4.cfr_renamed_593().cfr_renamed_593().cfr_renamed_5078(this.cfr_renamed_1.cfr_renamed_593())) {
                this.cfr_renamed_1 = this.cfr_renamed_4.cfr_renamed_593();
                return;
            }
            sprxul sprxul4 = this;
            if (sprxul4.cfr_renamed_10892(sprxul4.cfr_renamed_4.cfr_renamed_593().cfr_renamed_284())) return;
            this.cfr_renamed_1 = this.cfr_renamed_4.cfr_renamed_593();
            return;
        } else {
            this.cfr_renamed_1 = this.cfr_renamed_4.cfr_renamed_593();
        }
    }
}

