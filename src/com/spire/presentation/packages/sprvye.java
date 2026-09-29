/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprxll;
import java.io.IOException;
import java.io.InputStream;

public class sprvye {
    public InputStream cfr_renamed_3;
    public sprjvm cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvye(InputStream inputStream) throws sprlyl {
        this.cfr_renamed_3 = inputStream;
        try {
            void arg0;
            sprden sprden2 = new sprden((InputStream)arg0);
            sprqp sprqp2 = (sprqp)sprden2.cfr_renamed_24();
            if (sprqp2 == null) {
                throw new sprlyl(DataColumn.cfr_renamed_9("<\u001eR\u0012\u001d\u001f\u0006\u0014\u001c\u0005R\u0017\u001d\u0004\u001c\u0015\\"));
            }
            this.cfr_renamed_4 = new sprjvm(sprqp2);
            return;
        }
        catch (IOException iOException) {
            throw new sprlyl(sprxll.cfr_renamed_9("\u001d\u001f\u0011(75$$=?:p&554=>3p7?:$1> ~"), iOException);
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(DataColumn.cfr_renamed_9("$\u001c\u0014\n\u0001\u0017\u0012\u0006\u0014\u0016Q\u001d\u0013\u0018\u0014\u0011\u0005R\u0003\u0017\u0010\u0016\u0018\u001c\u0016R\u0012\u001d\u001f\u0006\u0014\u001c\u0005\\"), classCastException);
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

    public void cfr_renamed_2637() throws IOException {
        this.cfr_renamed_3.close();
    }
}

