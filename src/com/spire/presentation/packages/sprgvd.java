/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprcre;
import com.spire.presentation.packages.sprcud;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprexd;
import com.spire.presentation.packages.sprfma;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprmn;
import com.spire.presentation.packages.sprol;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprrrd;
import com.spire.presentation.packages.spruhe;
import java.io.IOException;

public class sprgvd
implements sprmn {
    private sprol cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprdce cfr_renamed_3;
    private spruhe cfr_renamed_4;

    public sprgvd(sprol sprol2) {
        this.cfr_renamed_1 = sprol2;
    }

    private /* synthetic */ boolean cfr_renamed_4246(spra arg0) {
        return arg0 == null || arg0 instanceof sprcre;
    }

    @Override
    public sprrj cfr_renamed_461() {
        sprgvd sprgvd2 = new sprgvd(this.cfr_renamed_1);
        sprgvd sprgvd3 = this;
        sprgvd2.cfr_renamed_2 = sprgvd3.cfr_renamed_2;
        sprgvd2.cfr_renamed_4 = sprgvd3.cfr_renamed_4;
        sprgvd2.cfr_renamed_3 = this.cfr_renamed_3;
        return sprgvd2;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprgvd sprgvd2 = (sprgvd)arg0;
        sprgvd sprgvd3 = this;
        sprgvd sprgvd4 = sprgvd2;
        this.cfr_renamed_1 = sprgvd2.cfr_renamed_1;
        this.cfr_renamed_2 = sprgvd4.cfr_renamed_2;
        sprgvd3.cfr_renamed_4 = sprgvd4.cfr_renamed_4;
        sprgvd3.cfr_renamed_3 = sprgvd2.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_3232(sprcud arg0, sprcyd arg1) throws sprrrd {
        if (this.cfr_renamed_4 != null && !this.cfr_renamed_4.equals(arg1.cfr_renamed_102())) {
            throw new sprrrd(sprfma.cfr_renamed_9("~*O;T)T,\\;XoT<N:XoY X<\u001d!R;\u001d\"\\;^'\u001d?\\=X!I"));
        }
        if (this.cfr_renamed_3 != null) {
            try {
                sprcyd sprcyd2;
                sprdce sprdce2;
                if (this.cfr_renamed_3.cfr_renamed_593().equals(this.cfr_renamed_2)) {
                    sprdce2 = this.cfr_renamed_3;
                    sprcyd2 = arg1;
                } else {
                    sprgvd sprgvd2 = this;
                    sprdce2 = new sprdce(sprgvd2.cfr_renamed_2, sprgvd2.cfr_renamed_3.cfr_renamed_1227());
                    sprcyd2 = arg1;
                }
                if (!sprcyd2.cfr_renamed_1488(this.cfr_renamed_1.cfr_renamed_1567(sprdce2))) {
                    throw new sprrrd(sprcno.cfr_renamed_9("\u0016['J<X<]4J0\u001e&W2P4J L0\u001e;Q!\u001e3Q'\u001e%K7R<]uU0GuW;\u001e%_'[;J"));
                }
            }
            catch (sprfya sprfya2) {
                throw new sprrrd(new StringBuilder().insert(0, sprfma.cfr_renamed_9("h!\\-Q*\u001d;Ro^=X.I*\u001d9X=T)T*Ou\u001d")).append(sprfya2.getMessage()).toString(), sprfya2);
            }
            catch (sprexd sprexd2) {
                throw new sprrrd(new StringBuilder().insert(0, sprcno.cfr_renamed_9("\u0000P4\\9[uJ:\u001e#_9W1_![uM<Y;_!K'[o\u001e")).append(sprexd2.getMessage()).toString(), sprexd2);
            }
            catch (IOException iOException) {
                throw new sprrrd(new StringBuilder().insert(0, sprfma.cfr_renamed_9("\u001aS._#XoI \u001d-H&Q+\u001d?H-Q&^oV*Du\u001d")).append(iOException.getMessage()).toString(), iOException);
            }
        }
        sprgvd sprgvd3 = this;
        sprgvd3.cfr_renamed_4 = arg1.cfr_renamed_1485();
        sprgvd3.cfr_renamed_3 = arg1.cfr_renamed_1489();
        if (this.cfr_renamed_2 != null) {
            if (!this.cfr_renamed_3.cfr_renamed_593().cfr_renamed_593().equals(this.cfr_renamed_2.cfr_renamed_593())) {
                this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_593();
                return;
            }
            sprgvd sprgvd4 = this;
            if (sprgvd4.cfr_renamed_4246(sprgvd4.cfr_renamed_3.cfr_renamed_593().cfr_renamed_284())) return;
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_593();
            return;
        } else {
            this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_593();
        }
    }
}

