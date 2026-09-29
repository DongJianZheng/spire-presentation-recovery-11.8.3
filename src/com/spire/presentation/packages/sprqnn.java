/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprjcp;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprqnn
extends sprsmn {
    private sprlsn cfr_renamed_2;
    private sprxln cfr_renamed_3;
    private float cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_13510(sprsuja arg0, sprsuja arg1) {
        if (arg0.cfr_renamed_1980() > arg1.cfr_renamed_1980() || arg0.cfr_renamed_1980() == arg1.cfr_renamed_1980() && arg0.spr\u3181() < arg1.spr\u3181()) {
            return -1;
        }
        return 1;
    }

    private /* synthetic */ sprwvn cfr_renamed_13511(sprfqn arg0, boolean arg1) {
        float f = arg1 ? 0.01f : this.cfr_renamed_4;
        sprfqn sprfqn2 = new sprfqn();
        sprfqn sprfqn3 = new sprfqn();
        int n = 0;
        sprsuja sprsuja2 = sprsuja.cfr_renamed_13377();
        sprsuja sprsuja3 = sprsuja.cfr_renamed_13377();
        sprsuja sprsuja4 = sprsuja.cfr_renamed_13377();
        float f2 = 0.0f;
        int n2 = n;
        while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            sprfqn sprfqn4;
            sprjcp sprjcp2;
            int n3;
            if (n == 0) {
                sprsuja2 = arg1 ? arg0.cfr_renamed_13187().cfr_renamed_576(arg0.cfr_renamed_13187().cfr_renamed_11861() - 1) : arg0.cfr_renamed_13187().cfr_renamed_576(1);
                sprsuja4 = arg0.cfr_renamed_13187().cfr_renamed_576(0);
            }
            if (n == arg0.cfr_renamed_13187().cfr_renamed_11861() - 1) {
                sprfqn sprfqn5 = arg0;
                sprsuja3 = arg1 ? sprfqn5.cfr_renamed_13187().cfr_renamed_576(0) : sprfqn5.cfr_renamed_13187().cfr_renamed_576(n - 1);
                n3 = n;
            } else {
                sprsuja3 = arg0.cfr_renamed_13187().cfr_renamed_576(n + 1);
                n3 = n;
            }
            int n4 = n3 != arg0.cfr_renamed_13187().cfr_renamed_11861() - 1 || arg1 ? sprqnn.cfr_renamed_13510(sprsuja4, sprsuja3) : sprqnn.cfr_renamed_13510(sprsuja2, sprsuja4);
            float f3 = (float)n4 * f / 2.0f;
            if (n == 0) {
                f2 = (float)sprqnn.cfr_renamed_13510(sprsuja2, sprsuja4) * f / 2.0f;
            }
            sprjcp sprjcp3 = new sprjcp(sprsuja4, sprsuja3);
            sprjcp sprjcp4 = new sprjcp(sprsuja2, sprsuja4);
            sprjcp sprjcp5 = sprjcp3;
            sprjcp sprjcp6 = sprjcp5.cfr_renamed_13512(f3);
            sprjcp sprjcp7 = sprjcp5.cfr_renamed_13512(-f3);
            sprsuja[] sprsujaArray = new sprsuja[1];
            sprsuja[] sprsujaArray2 = new sprsuja[1];
            if (sprjcp.cfr_renamed_13513(sprjcp3, sprjcp4)) {
                sprjcp2 = sprjcp3.cfr_renamed_13514(sprsuja4);
                sprfqn4 = sprfqn2;
                sprjcp sprjcp8 = sprjcp2;
                sprjcp.cfr_renamed_13515(sprjcp8, sprjcp6, sprsujaArray);
                sprjcp.cfr_renamed_13515(sprjcp8, sprjcp7, sprsujaArray2);
            } else {
                sprjcp sprjcp9 = sprjcp4;
                sprjcp2 = sprjcp9.cfr_renamed_13512(f2);
                sprjcp sprjcp10 = sprjcp9.cfr_renamed_13512(-f2);
                sprfqn4 = sprfqn2;
                sprjcp.cfr_renamed_13515(sprjcp2, sprjcp6, sprsujaArray);
                sprjcp.cfr_renamed_13515(sprjcp10, sprjcp7, sprsujaArray2);
            }
            sprfqn4.cfr_renamed_13187().cfr_renamed_13516(sprsujaArray[0]);
            sprfqn3.cfr_renamed_13187().cfr_renamed_13516(sprsujaArray2[0]);
            sprsuja2 = sprsuja4;
            sprsuja4 = sprsuja3;
            f2 = f3;
            n2 = ++n;
        }
        sprwvn sprwvn2 = new sprwvn();
        if (arg1) {
            sprwvn sprwvn3 = sprwvn2;
            sprovja.cfr_renamed_11658(sprwvn2, sprfqn2);
            sprfqn sprfqn6 = sprfqn3;
            sprfqn6.cfr_renamed_13187().cfr_renamed_9979();
            sprovja.cfr_renamed_11658(sprwvn3, sprfqn6);
            return sprwvn3;
        }
        sprfqn3.cfr_renamed_13187().cfr_renamed_9979();
        sprwvn sprwvn4 = sprwvn2;
        sprfqn2.cfr_renamed_13187().cfr_renamed_13517(sprfqn3.cfr_renamed_13187());
        sprovja.cfr_renamed_11658(sprwvn4, sprfqn2);
        return sprwvn4;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13186(sprfqn sprfqn2) {
        void arg0;
        sprqnn sprqnn2 = this;
        this.cfr_renamed_2.cfr_renamed_13518(sprqnn2.cfr_renamed_13511((sprfqn)arg0, this.cfr_renamed_2.cfr_renamed_13174()));
        super.cfr_renamed_13186(sprfqn2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13178(sprlsn sprlsn2) {
        void arg0;
        sprqnn sprqnn2 = this;
        sprqnn sprqnn3 = this;
        sprqnn2.cfr_renamed_2 = new sprlsn();
        sprqnn2.cfr_renamed_2.cfr_renamed_12625(arg0.cfr_renamed_13174());
        super.cfr_renamed_13178(sprlsn2);
    }

    public static sprxln cfr_renamed_13519(sprxln arg0) {
        sprqnn sprqnn2;
        sprqnn sprqnn3 = sprqnn2 = new sprqnn();
        sprqnn sprqnn4 = sprqnn2;
        sprqnn sprqnn5 = sprqnn2;
        sprqnn4.cfr_renamed_3 = new sprxln(arg0.cfr_renamed_12571());
        sprqnn4.cfr_renamed_4 = arg0.cfr_renamed_12571().cfr_renamed_1942();
        arg0.cfr_renamed_13121(sprqnn3);
        sprqnn2.cfr_renamed_3.cfr_renamed_12505(null);
        sprqnn3.cfr_renamed_3.cfr_renamed_12550(arg0.cfr_renamed_12571().cfr_renamed_12551());
        return sprqnn2.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        sprqnn sprqnn2 = this;
        sprqnn2.cfr_renamed_3.cfr_renamed_12507(sprqnn2.cfr_renamed_2);
        super.cfr_renamed_13173(arg0);
    }
}

