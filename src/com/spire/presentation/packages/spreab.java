/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhbga;
import com.spire.presentation.packages.sprkza;
import com.spire.presentation.packages.sprmgb;
import com.spire.presentation.packages.sprnb;
import com.spire.presentation.packages.sprnra;
import com.spire.presentation.packages.sprsa;
import com.spire.presentation.packages.sprwa;
import java.io.IOException;

public class spreab {
    private final String cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final sprnb cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spreab(String string, byte[] byArray, byte[] byArray2, sprnb sprnb2) {
        void arg2;
        void arg1;
        void arg0;
        spreab spreab2 = this;
        spreab spreab3 = this;
        spreab3.cfr_renamed_1 = arg0;
        spreab3.cfr_renamed_4 = arg1;
        spreab2.cfr_renamed_2 = arg2;
        spreab2.cfr_renamed_3 = sprnb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmgb cfr_renamed_1599(sprwa arg0) throws IOException {
        try {
            sprsa sprsa2 = arg0.cfr_renamed_1600(this.cfr_renamed_1);
            spreab spreab2 = this;
            return this.cfr_renamed_3.cfr_renamed_1596(sprsa2.cfr_renamed_123(spreab2.cfr_renamed_2, spreab2.cfr_renamed_4));
        }
        catch (IOException iOException) {
            throw iOException;
        }
        catch (sprfya sprfya2) {
            throw new sprkza(new StringBuilder().insert(0, sprhbga.cfr_renamed_9("\u000b\u001a\u0006\u0015\u0007\u000fH\u0018\u001a\u001e\t\u000f\r[\r\u0003\u001c\t\t\u0018\u001c\u0012\u0007\u0015H\u0014\u0018\u001e\u001a\u001a\u001c\u0014\u001aAH")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
        catch (Exception exception) {
            throw new sprkza(new StringBuilder().insert(0, sprnra.cfr_renamed_9("\u000bI\rT\u001eE\u0007^\u0000\u0011\u001eC\u0001R\u000bB\u001dX\u0000VNZ\u000bHNA\u000fX\u001c\u000bN")).append(exception.getMessage()).toString(), exception);
        }
    }
}

