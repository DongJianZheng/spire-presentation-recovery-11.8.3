/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjyf;
import com.spire.presentation.packages.sprmdg;
import com.spire.presentation.packages.sprswf;

public class spreuf {
    public sprjyf cfr_renamed_4;

    public sprswf cfr_renamed_6957(sprmdg arg0, sprmdg arg1, sprmdg arg2, sprmdg arg3) {
        spreuf spreuf2 = this;
        sprmdg sprmdg2 = spreuf2.cfr_renamed_4.cfr_renamed_6826(arg0, arg2);
        sprmdg sprmdg3 = spreuf2.cfr_renamed_4.cfr_renamed_6826(arg1, arg3);
        return new sprswf(sprmdg2, sprmdg3);
    }

    public void cfr_renamed_6873(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, sprmdg[] arg4, int arg5, int arg6) {
        int n;
        int n2 = 1 << arg6 >> 1;
        int n3 = n2 >> 1;
        arg0[arg1 + 0] = arg2[arg3 + 0];
        arg0[arg1 + n2] = arg4[arg5 + 0];
        int n4 = n = 0;
        while (n4 < n3) {
            sprmdg sprmdg2 = arg2[arg3 + n];
            sprmdg sprmdg3 = arg2[arg3 + n + n3];
            spreuf spreuf2 = this;
            spreuf spreuf3 = this;
            sprswf sprswf2 = spreuf3.cfr_renamed_6958(arg4[arg5 + n], arg4[arg5 + n + n3], spreuf3.cfr_renamed_4.cfr_renamed_3[(n + n2 << 1) + 0], this.cfr_renamed_4.cfr_renamed_3[(n + n2 << 1) + 1]);
            sprmdg sprmdg4 = sprswf2.cfr_renamed_4;
            sprmdg sprmdg5 = sprswf2.cfr_renamed_3;
            sprswf2 = spreuf2.cfr_renamed_6957(sprmdg2, sprmdg3, sprmdg4, sprmdg5);
            sprmdg sprmdg6 = sprswf2.cfr_renamed_4;
            sprmdg sprmdg7 = sprswf2.cfr_renamed_3;
            arg0[arg1 + (n << 1) + 0] = sprmdg6;
            arg0[arg1 + (n << 1) + 0 + n2] = sprmdg7;
            sprswf2 = spreuf2.cfr_renamed_6959(sprmdg2, sprmdg3, sprmdg4, sprmdg5);
            sprmdg6 = sprswf2.cfr_renamed_4;
            sprmdg7 = sprswf2.cfr_renamed_3;
            arg0[arg1 + (n << 1) + 1] = sprmdg6;
            int n5 = arg1 + (n << 1) + 1 + n2;
            arg0[n5] = sprmdg7;
            n4 = ++n;
        }
    }

    public void cfr_renamed_6861(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg4 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg[] sprmdgArray = arg0;
            sprmdg[] sprmdgArray2 = arg0;
            sprmdg sprmdg2 = sprmdgArray[arg1 + n];
            sprmdg sprmdg3 = sprmdgArray2[arg1 + n + n2];
            sprmdg sprmdg4 = arg2[arg3 + n];
            spreuf spreuf2 = this;
            sprmdg sprmdg5 = spreuf2.cfr_renamed_4.cfr_renamed_6827(arg2[arg3 + n + n2]);
            sprswf sprswf2 = spreuf2.cfr_renamed_6958(sprmdg2, sprmdg3, sprmdg4, sprmdg5);
            sprmdgArray[arg1 + n] = sprswf2.cfr_renamed_4;
            int n4 = arg1 + n + n2;
            sprmdgArray2[n4] = sprswf2.cfr_renamed_3;
            n3 = ++n;
        }
    }

    public sprswf cfr_renamed_6960(sprmdg arg0, sprmdg arg1) {
        sprmdg sprmdg2 = arg0;
        sprmdg sprmdg3 = arg1;
        spreuf spreuf2 = this;
        spreuf spreuf3 = this;
        sprmdg sprmdg4 = spreuf2.cfr_renamed_4.cfr_renamed_6826(spreuf3.cfr_renamed_4.cfr_renamed_6822(sprmdg2), this.cfr_renamed_4.cfr_renamed_6822(sprmdg3));
        sprmdg4 = spreuf2.cfr_renamed_4.cfr_renamed_6825(sprmdg4);
        sprmdg sprmdg5 = spreuf3.cfr_renamed_4.cfr_renamed_6814(sprmdg2, sprmdg4);
        sprmdg sprmdg6 = spreuf2.cfr_renamed_4.cfr_renamed_6814(this.cfr_renamed_4.cfr_renamed_6827(sprmdg3), sprmdg4);
        return new sprswf(sprmdg5, sprmdg6);
    }

    public void cfr_renamed_6874(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg4;
        int n3 = n = 0;
        while (n3 < n2) {
            arg0[arg1 + ++n] = this.cfr_renamed_4.cfr_renamed_6815(arg0[arg1 + n], arg2[arg3 + n]);
            n3 = n;
        }
    }

    public void cfr_renamed_6871(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, sprmdg[] arg4, int arg5, int arg6) {
        int n;
        int n2 = 1 << arg6 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg sprmdg2 = arg0[arg1 + n];
            sprmdg sprmdg3 = arg0[arg1 + n + n2];
            sprmdg[] sprmdgArray = arg2;
            sprmdg[] sprmdgArray2 = arg2;
            sprmdg sprmdg4 = sprmdgArray[arg3 + n];
            sprmdg sprmdg5 = sprmdgArray2[arg3 + n + n2];
            sprmdg[] sprmdgArray3 = arg4;
            sprmdg[] sprmdgArray4 = arg4;
            sprmdg sprmdg6 = sprmdgArray3[arg5 + n];
            sprmdg sprmdg7 = sprmdgArray4[arg5 + n + n2];
            spreuf spreuf2 = this;
            sprswf sprswf2 = spreuf2.cfr_renamed_6961(sprmdg4, sprmdg5, sprmdg2, sprmdg3);
            sprmdg sprmdg8 = sprswf2.cfr_renamed_4;
            sprmdg sprmdg9 = sprswf2.cfr_renamed_3;
            sprswf2 = spreuf2.cfr_renamed_6958(sprmdg8, sprmdg9, sprmdg4, this.cfr_renamed_4.cfr_renamed_6827(sprmdg5));
            sprmdg4 = sprswf2.cfr_renamed_4;
            sprmdg5 = sprswf2.cfr_renamed_3;
            sprswf2 = spreuf2.cfr_renamed_6959(sprmdg6, sprmdg7, sprmdg4, sprmdg5);
            sprmdgArray3[arg5 + n] = sprswf2.cfr_renamed_4;
            sprmdgArray4[arg5 + n + n2] = sprswf2.cfr_renamed_3;
            sprmdgArray[arg3 + n] = sprmdg8;
            int n4 = arg3 + n + n2;
            sprmdgArray2[n4] = this.cfr_renamed_4.cfr_renamed_6827(sprmdg9);
            n3 = ++n;
        }
    }

    public void cfr_renamed_6862(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg4;
        int n3 = n = 0;
        while (n3 < n2) {
            arg0[arg1 + ++n] = this.cfr_renamed_4.cfr_renamed_6826(arg0[arg1 + n], arg2[arg3 + n]);
            n3 = n;
        }
    }

    public void cfr_renamed_6858(sprmdg[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 1 << arg2 >> 1;
        int n3 = 1;
        int n4 = 2;
        int n5 = n3;
        while (n5 < arg2) {
            int n6 = n2 >> 1;
            int n7 = n4 >> 1;
            int n8 = 0;
            int n9 = 0;
            int n10 = n8;
            while (n10 < n7) {
                int n11 = n9 + n6;
                spreuf spreuf2 = this;
                sprmdg sprmdg2 = spreuf2.cfr_renamed_4.cfr_renamed_3[(n4 + n8 << 1) + 0];
                sprmdg sprmdg3 = spreuf2.cfr_renamed_4.cfr_renamed_3[(n4 + n8 << 1) + 1];
                int n12 = n9;
                while (n12 < n11) {
                    int n13;
                    sprmdg[] sprmdgArray = arg0;
                    sprmdg[] sprmdgArray2 = arg0;
                    sprmdg sprmdg4 = sprmdgArray[arg1 + n13];
                    sprmdg sprmdg5 = sprmdgArray2[arg1 + n13 + n];
                    sprmdg sprmdg6 = sprmdgArray[arg1 + n13 + n6];
                    sprmdg sprmdg7 = sprmdgArray2[arg1 + n13 + n6 + n];
                    spreuf spreuf3 = this;
                    sprswf sprswf2 = spreuf3.cfr_renamed_6958(sprmdg6, sprmdg7, sprmdg2, sprmdg3);
                    sprmdg6 = sprswf2.cfr_renamed_4;
                    sprmdg7 = sprswf2.cfr_renamed_3;
                    sprswf2 = spreuf3.cfr_renamed_6957(sprmdg4, sprmdg5, sprmdg6, sprmdg7);
                    sprmdgArray[arg1 + n13] = sprswf2.cfr_renamed_4;
                    sprmdgArray2[arg1 + n13 + n] = sprswf2.cfr_renamed_3;
                    sprswf2 = this.cfr_renamed_6959(sprmdg4, sprmdg5, sprmdg6, sprmdg7);
                    sprmdgArray[arg1 + n13 + n6] = sprswf2.cfr_renamed_4;
                    int n14 = arg1 + n13 + n6 + n;
                    sprmdgArray2[n14] = sprswf2.cfr_renamed_3;
                    n12 = ++n13;
                }
                n9 += n2;
                n10 = ++n8;
            }
            n2 = n6;
            n4 <<= 1;
            n5 = ++n3;
        }
    }

    public sprswf cfr_renamed_6962(sprmdg arg0, sprmdg arg1) {
        sprmdg sprmdg2 = arg0;
        sprmdg sprmdg3 = arg1;
        spreuf spreuf2 = this;
        spreuf spreuf3 = this;
        sprmdg sprmdg4 = spreuf2.cfr_renamed_4.cfr_renamed_6815(spreuf2.cfr_renamed_4.cfr_renamed_6822(sprmdg2), spreuf3.cfr_renamed_4.cfr_renamed_6822(sprmdg3));
        sprmdg sprmdg5 = spreuf3.cfr_renamed_4.cfr_renamed_6831(this.cfr_renamed_4.cfr_renamed_6814(sprmdg2, sprmdg3));
        return new sprswf(sprmdg4, sprmdg5);
    }

    public void cfr_renamed_6956(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, sprmdg[] arg4, int arg5, sprmdg[] arg6, int arg7, sprmdg[] arg8, int arg9, int arg10) {
        int n;
        int n2 = 1 << arg10 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg sprmdg2 = arg2[arg3 + n];
            sprmdg sprmdg3 = arg2[arg3 + n + n2];
            sprmdg sprmdg4 = arg4[arg5 + n];
            sprmdg sprmdg5 = arg4[arg5 + n + n2];
            sprmdg sprmdg6 = arg6[arg7 + n];
            sprmdg sprmdg7 = arg6[arg7 + n + n2];
            sprmdg sprmdg8 = arg8[arg9 + n];
            sprmdg sprmdg9 = arg8[arg9 + n + n2];
            spreuf spreuf2 = this;
            sprswf sprswf2 = spreuf2.cfr_renamed_6958(sprmdg2, sprmdg3, sprmdg6, this.cfr_renamed_4.cfr_renamed_6827(sprmdg7));
            sprmdg sprmdg10 = sprswf2.cfr_renamed_4;
            sprmdg sprmdg11 = sprswf2.cfr_renamed_3;
            sprswf2 = spreuf2.cfr_renamed_6958(sprmdg4, sprmdg5, sprmdg8, this.cfr_renamed_4.cfr_renamed_6827(sprmdg9));
            sprmdg sprmdg12 = sprswf2.cfr_renamed_4;
            sprmdg sprmdg13 = sprswf2.cfr_renamed_3;
            arg0[arg1 + n] = this.cfr_renamed_4.cfr_renamed_6826(sprmdg10, sprmdg12);
            int n4 = arg1 + n + n2;
            arg0[n4] = this.cfr_renamed_4.cfr_renamed_6826(sprmdg11, sprmdg13);
            n3 = ++n;
        }
    }

    public void cfr_renamed_6860(sprmdg[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 1 << arg2 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg[] sprmdgArray = arg0;
            sprmdg[] sprmdgArray2 = arg0;
            sprmdg sprmdg2 = sprmdgArray[arg1 + n];
            sprmdg sprmdg3 = sprmdgArray2[arg1 + n + n2];
            spreuf spreuf2 = this;
            sprmdgArray[arg1 + n] = spreuf2.cfr_renamed_4.cfr_renamed_6826(spreuf2.cfr_renamed_4.cfr_renamed_6822(sprmdg2), this.cfr_renamed_4.cfr_renamed_6822(sprmdg3));
            int n4 = arg1 + n + n2;
            sprmdgArray2[n4] = this.cfr_renamed_4.cfr_renamed_107;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6884(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, sprmdg[] arg4, int arg5, sprmdg[] arg6, int arg7, sprmdg[] arg8, int arg9, int arg10) {
        int n;
        int n2 = 1 << arg10 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg sprmdg2 = arg4[arg5 + n];
            sprmdg sprmdg3 = arg4[arg5 + n + n2];
            sprmdg sprmdg4 = arg6[arg7 + n];
            sprmdg sprmdg5 = arg6[arg7 + n + n2];
            sprmdg sprmdg6 = arg8[arg9 + n];
            sprmdg sprmdg7 = arg8[arg9 + n + n2];
            spreuf spreuf2 = this;
            sprswf sprswf2 = spreuf2.cfr_renamed_6961(sprmdg4, sprmdg5, sprmdg2, sprmdg3);
            sprmdg sprmdg8 = sprswf2.cfr_renamed_4;
            sprmdg sprmdg9 = sprswf2.cfr_renamed_3;
            sprswf2 = spreuf2.cfr_renamed_6958(sprmdg8, sprmdg9, sprmdg4, this.cfr_renamed_4.cfr_renamed_6827(sprmdg5));
            sprmdg4 = sprswf2.cfr_renamed_4;
            sprmdg5 = sprswf2.cfr_renamed_3;
            sprswf2 = spreuf2.cfr_renamed_6959(sprmdg6, sprmdg7, sprmdg4, sprmdg5);
            arg0[arg1 + n] = sprswf2.cfr_renamed_4;
            arg0[arg1 + n + n2] = sprswf2.cfr_renamed_3;
            arg2[arg3 + n] = sprmdg8;
            int n4 = arg3 + n + n2;
            arg2[n4] = this.cfr_renamed_4.cfr_renamed_6827(sprmdg9);
            n3 = ++n;
        }
    }

    public sprswf cfr_renamed_6958(sprmdg arg0, sprmdg arg1, sprmdg arg2, sprmdg arg3) {
        sprmdg sprmdg2 = arg0;
        sprmdg sprmdg3 = arg1;
        sprmdg sprmdg4 = arg2;
        sprmdg sprmdg5 = arg3;
        spreuf spreuf2 = this;
        spreuf spreuf3 = this;
        sprmdg sprmdg6 = spreuf2.cfr_renamed_4.cfr_renamed_6815(spreuf2.cfr_renamed_4.cfr_renamed_6814(sprmdg2, sprmdg4), spreuf3.cfr_renamed_4.cfr_renamed_6814(sprmdg3, sprmdg5));
        sprmdg sprmdg7 = spreuf3.cfr_renamed_4.cfr_renamed_6826(this.cfr_renamed_4.cfr_renamed_6814(sprmdg2, sprmdg5), this.cfr_renamed_4.cfr_renamed_6814(sprmdg3, sprmdg4));
        return new sprswf(sprmdg6, sprmdg7);
    }

    public void cfr_renamed_6948(sprmdg[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 1 << arg2;
        int n3 = n = n2 >> 1;
        while (n3 < n2) {
            arg0[arg1 + ++n] = this.cfr_renamed_4.cfr_renamed_6827(arg0[arg1 + n]);
            n3 = n;
        }
    }

    public void cfr_renamed_6949(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg4 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = arg1;
            arg0[n4 + n] = this.cfr_renamed_4.cfr_renamed_6814(arg0[arg1 + n], arg2[arg3 + n]);
            arg0[n4 + ++n + n2] = this.cfr_renamed_4.cfr_renamed_6814(arg0[arg1 + n + n2], arg2[arg3 + n]);
            n3 = n;
        }
    }

    public void cfr_renamed_6863(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg4 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg[] sprmdgArray = arg0;
            sprmdg[] sprmdgArray2 = arg0;
            sprmdg sprmdg2 = sprmdgArray[arg1 + n];
            sprmdg sprmdg3 = sprmdgArray2[arg1 + n + n2];
            sprmdg sprmdg4 = arg2[arg3 + n];
            sprmdg sprmdg5 = arg2[arg3 + n + n2];
            sprswf sprswf2 = this.cfr_renamed_6958(sprmdg2, sprmdg3, sprmdg4, sprmdg5);
            sprmdgArray[arg1 + n] = sprswf2.cfr_renamed_4;
            int n4 = arg1 + n + n2;
            sprmdgArray2[n4] = sprswf2.cfr_renamed_3;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6963(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg4 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg[] sprmdgArray = arg0;
            sprmdg[] sprmdgArray2 = arg0;
            sprmdg sprmdg2 = sprmdgArray[arg1 + n];
            sprmdg sprmdg3 = sprmdgArray2[arg1 + n + n2];
            sprmdg sprmdg4 = arg2[arg3 + n];
            sprmdg sprmdg5 = arg2[arg3 + n + n2];
            sprswf sprswf2 = this.cfr_renamed_6961(sprmdg2, sprmdg3, sprmdg4, sprmdg5);
            sprmdgArray[arg1 + n] = sprswf2.cfr_renamed_4;
            int n4 = arg1 + n + n2;
            sprmdgArray2[n4] = sprswf2.cfr_renamed_3;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6866(sprmdg[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 1 << arg2;
        int n3 = 1;
        int n4 = n2;
        int n5 = n2 >> 1;
        int n6 = n = arg2;
        while (n6 > 1) {
            int n7;
            int n8 = n4 >> 1;
            int n9 = n3 << 1;
            int n10 = 0;
            int n11 = n7 = 0;
            while (n11 < n5) {
                int n12 = n7 + n3;
                spreuf spreuf2 = this;
                sprmdg sprmdg2 = spreuf2.cfr_renamed_4.cfr_renamed_3[(n8 + n10 << 1) + 0];
                sprmdg sprmdg3 = spreuf2.cfr_renamed_4.cfr_renamed_6827(this.cfr_renamed_4.cfr_renamed_3[(n8 + n10 << 1) + 1]);
                int n13 = n7;
                while (n13 < n12) {
                    int n14;
                    sprmdg[] sprmdgArray = arg0;
                    sprmdg[] sprmdgArray2 = arg0;
                    sprmdg sprmdg4 = sprmdgArray[arg1 + n14];
                    sprmdg sprmdg5 = sprmdgArray2[arg1 + n14 + n5];
                    sprmdg sprmdg6 = sprmdgArray[arg1 + n14 + n3];
                    sprmdg sprmdg7 = sprmdgArray2[arg1 + n14 + n3 + n5];
                    sprswf sprswf2 = this.cfr_renamed_6957(sprmdg4, sprmdg5, sprmdg6, sprmdg7);
                    sprmdgArray[arg1 + n14] = sprswf2.cfr_renamed_4;
                    sprmdgArray2[arg1 + n14 + n5] = sprswf2.cfr_renamed_3;
                    spreuf spreuf3 = this;
                    sprswf2 = spreuf3.cfr_renamed_6959(sprmdg4, sprmdg5, sprmdg6, sprmdg7);
                    sprmdg4 = sprswf2.cfr_renamed_4;
                    sprmdg5 = sprswf2.cfr_renamed_3;
                    sprswf2 = spreuf3.cfr_renamed_6958(sprmdg4, sprmdg5, sprmdg2, sprmdg3);
                    sprmdgArray[arg1 + n14 + n3] = sprswf2.cfr_renamed_4;
                    int n15 = arg1 + n14 + n3 + n5;
                    sprmdgArray2[n15] = sprswf2.cfr_renamed_3;
                    n13 = ++n14;
                }
                ++n10;
                n11 = n7 + n9;
            }
            n3 = n9;
            n4 = n8;
            n6 = --n;
        }
        if (arg2 > 0) {
            sprmdg sprmdg8 = this.cfr_renamed_4.cfr_renamed_31[arg2];
            int n16 = n = 0;
            while (n16 < n2) {
                arg0[arg1 + ++n] = this.cfr_renamed_4.cfr_renamed_6814(arg0[arg1 + n], sprmdg8);
                n16 = n;
            }
        }
    }

    public void cfr_renamed_6864(sprmdg[] arg0, int arg1, sprmdg arg2, int arg3) {
        int n;
        int n2 = 1 << arg3;
        int n3 = n = 0;
        while (n3 < n2) {
            arg0[arg1 + ++n] = this.cfr_renamed_4.cfr_renamed_6814(arg0[arg1 + n], arg2);
            n3 = n;
        }
    }

    public sprswf cfr_renamed_6961(sprmdg arg0, sprmdg arg1, sprmdg arg2, sprmdg arg3) {
        sprmdg sprmdg2 = arg0;
        sprmdg sprmdg3 = arg1;
        sprmdg sprmdg4 = arg2;
        sprmdg sprmdg5 = arg3;
        spreuf spreuf2 = this;
        spreuf spreuf3 = this;
        sprmdg sprmdg6 = spreuf2.cfr_renamed_4.cfr_renamed_6826(spreuf3.cfr_renamed_4.cfr_renamed_6822(sprmdg4), this.cfr_renamed_4.cfr_renamed_6822(sprmdg5));
        sprmdg6 = spreuf2.cfr_renamed_4.cfr_renamed_6825(sprmdg6);
        sprmdg4 = spreuf3.cfr_renamed_4.cfr_renamed_6814(sprmdg4, sprmdg6);
        sprmdg5 = spreuf2.cfr_renamed_4.cfr_renamed_6814(this.cfr_renamed_4.cfr_renamed_6827(sprmdg5), sprmdg6);
        sprmdg sprmdg7 = spreuf2.cfr_renamed_4.cfr_renamed_6815(this.cfr_renamed_4.cfr_renamed_6814(sprmdg2, sprmdg4), this.cfr_renamed_4.cfr_renamed_6814(sprmdg3, sprmdg5));
        sprmdg sprmdg8 = spreuf2.cfr_renamed_4.cfr_renamed_6826(this.cfr_renamed_4.cfr_renamed_6814(sprmdg2, sprmdg5), this.cfr_renamed_4.cfr_renamed_6814(sprmdg3, sprmdg4));
        return new sprswf(sprmdg7, sprmdg8);
    }

    public void cfr_renamed_6947(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, sprmdg[] arg4, int arg5, int arg6) {
        int n;
        int n2 = 1 << arg6 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg sprmdg2 = arg2[arg3 + n];
            sprmdg sprmdg3 = arg2[arg3 + n + n2];
            sprmdg sprmdg4 = arg4[arg5 + n];
            sprmdg sprmdg5 = arg4[arg5 + n + n2];
            int n4 = arg1 + n;
            spreuf spreuf2 = this;
            spreuf spreuf3 = this;
            spreuf spreuf4 = this;
            arg0[n4] = spreuf2.cfr_renamed_4.cfr_renamed_6825(spreuf2.cfr_renamed_4.cfr_renamed_6826(spreuf3.cfr_renamed_4.cfr_renamed_6826(spreuf3.cfr_renamed_4.cfr_renamed_6822(sprmdg2), this.cfr_renamed_4.cfr_renamed_6822(sprmdg3)), spreuf4.cfr_renamed_4.cfr_renamed_6826(spreuf4.cfr_renamed_4.cfr_renamed_6822(sprmdg4), this.cfr_renamed_4.cfr_renamed_6822(sprmdg5))));
            n3 = ++n;
        }
    }

    public void cfr_renamed_6859(sprmdg[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 1 << arg2;
        int n3 = n = 0;
        while (n3 < n2) {
            arg0[arg1 + ++n] = this.cfr_renamed_4.cfr_renamed_6827(arg0[arg1 + n]);
            n3 = n;
        }
    }

    public spreuf() {
        spreuf spreuf2 = this;
        spreuf2.cfr_renamed_4 = new sprjyf();
    }

    public sprswf cfr_renamed_6959(sprmdg arg0, sprmdg arg1, sprmdg arg2, sprmdg arg3) {
        spreuf spreuf2 = this;
        sprmdg sprmdg2 = spreuf2.cfr_renamed_4.cfr_renamed_6815(arg0, arg2);
        sprmdg sprmdg3 = spreuf2.cfr_renamed_4.cfr_renamed_6815(arg1, arg3);
        return new sprswf(sprmdg2, sprmdg3);
    }

    public void cfr_renamed_6872(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, sprmdg[] arg4, int arg5, int arg6) {
        int n;
        int n2 = 1 << arg6 >> 1;
        int n3 = n2 >> 1;
        arg0[arg1 + 0] = arg4[arg5 + 0];
        arg2[arg3 + 0] = arg4[arg5 + n2];
        int n4 = n = 0;
        while (n4 < n3) {
            sprmdg sprmdg2 = arg4[arg5 + (n << 1) + 0];
            sprmdg sprmdg3 = arg4[arg5 + (n << 1) + 0 + n2];
            sprmdg sprmdg4 = arg4[arg5 + (n << 1) + 1];
            sprmdg sprmdg5 = arg4[arg5 + (n << 1) + 1 + n2];
            spreuf spreuf2 = this;
            sprswf sprswf2 = spreuf2.cfr_renamed_6957(sprmdg2, sprmdg3, sprmdg4, sprmdg5);
            sprmdg sprmdg6 = sprswf2.cfr_renamed_4;
            sprmdg sprmdg7 = sprswf2.cfr_renamed_3;
            arg0[arg1 + n] = this.cfr_renamed_4.cfr_renamed_6821(sprmdg6);
            arg0[arg1 + n + n3] = this.cfr_renamed_4.cfr_renamed_6821(sprmdg7);
            sprswf2 = spreuf2.cfr_renamed_6959(sprmdg2, sprmdg3, sprmdg4, sprmdg5);
            sprmdg6 = sprswf2.cfr_renamed_4;
            sprmdg7 = sprswf2.cfr_renamed_3;
            spreuf spreuf3 = this;
            spreuf spreuf4 = this;
            sprswf2 = spreuf3.cfr_renamed_6958(sprmdg6, sprmdg7, spreuf3.cfr_renamed_4.cfr_renamed_3[(n + n2 << 1) + 0], spreuf4.cfr_renamed_4.cfr_renamed_6827(spreuf4.cfr_renamed_4.cfr_renamed_3[(n + n2 << 1) + 1]));
            sprmdg6 = sprswf2.cfr_renamed_4;
            sprmdg7 = sprswf2.cfr_renamed_3;
            arg2[arg3 + n] = this.cfr_renamed_4.cfr_renamed_6821(sprmdg6);
            int n5 = arg3 + n + n3;
            arg2[n5] = this.cfr_renamed_4.cfr_renamed_6821(sprmdg7);
            n4 = ++n;
        }
    }

    public void cfr_renamed_6931(sprmdg[] arg0, int arg1, sprmdg[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg4 >> 1;
        int n3 = n = 0;
        while (n3 < n2) {
            sprmdg sprmdg2 = this.cfr_renamed_4.cfr_renamed_6825(arg2[arg3 + n]);
            int n4 = arg1;
            arg0[n4 + n] = this.cfr_renamed_4.cfr_renamed_6814(arg0[arg1 + n], sprmdg2);
            arg0[n4 + ++n + n2] = this.cfr_renamed_4.cfr_renamed_6814(arg0[arg1 + n + n2], sprmdg2);
            n3 = n;
        }
    }
}

