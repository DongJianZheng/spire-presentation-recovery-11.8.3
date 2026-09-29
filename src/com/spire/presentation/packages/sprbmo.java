/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprero;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprlio;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprywh;

@sprtea
public class sprbmo
extends sprlio {
    @Override
    public sprmrn cfr_renamed_16202() {
        try {
            sprbmo sprbmo2;
            sprphja sprphja2 = new sprphja(this.cfr_renamed_16190().cfr_renamed_14217(), this.cfr_renamed_16190().cfr_renamed_14218());
            if (sprphja2.cfr_renamed_1452() == 0.0f && sprphja2.cfr_renamed_1942() != 0.0f) {
                sprphja2 = new sprphja(sprphja2.cfr_renamed_1942(), sprphja2.cfr_renamed_1942());
                sprbmo2 = this;
            } else if (sprphja2.cfr_renamed_1452() != 0.0f && sprphja2.cfr_renamed_1942() == 0.0f) {
                sprphja2 = new sprphja(sprphja2.cfr_renamed_1452(), sprphja2.cfr_renamed_1452());
                sprbmo2 = this;
            } else {
                if (sprphja2.cfr_renamed_1452() == 0.0f && sprphja2.cfr_renamed_1942() == 0.0f) {
                    sprphja2 = new sprphja(96.0f, 96.0f);
                }
                sprbmo2 = this;
            }
            sprbmo2.cfr_renamed_16190().cfr_renamed_13232().cfr_renamed_11548(0L);
            byte[] byArray = sprero.cfr_renamed_16233(this.cfr_renamed_16190().cfr_renamed_13232(), sprphja2, this.cfr_renamed_16227());
            sprphja sprphja3 = sprlfja.cfr_renamed_15060(sprsto.cfr_renamed_13321(byArray).cfr_renamed_2773());
            sprson sprson2 = new sprson(sprsuja.cfr_renamed_13377(), sprphja3, byArray);
            sprmrn sprmrn2 = new sprmrn();
            sprmrn2.cfr_renamed_12507(sprson2);
            sprmrn2.cfr_renamed_12511(sprqgp.cfr_renamed_16234(new sprgeja(sprsuja.cfr_renamed_13377(), sprphja3), sprgeja.cfr_renamed_16235(this.cfr_renamed_16190().cfr_renamed_16236())));
            return sprmrn2;
        }
        catch (Exception exception) {
            sprbmo sprbmo3 = this;
            sprbmo3.cfr_renamed_16192().cfr_renamed_12479().cfr_renamed_12475(2, 3, sprywh.cfr_renamed_9("\u0000^\u000e1g|&s+\u007f#:3ugj5u$\u007f4ign/\u007fgw\"n&|.v\" gawg"), exception.getMessage());
            sprbmo3.cfr_renamed_16192().cfr_renamed_16212(true);
            return null;
        }
    }

    public sprbmo(sprdfo arg0, sprlmo arg1) {
        super(arg0, arg1);
    }
}

