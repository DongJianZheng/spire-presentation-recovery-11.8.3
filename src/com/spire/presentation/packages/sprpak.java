/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprfzj;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlrg;
import com.spire.presentation.packages.sprqbz;
import com.spire.presentation.packages.sprqry;
import com.spire.presentation.packages.sprrih;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprsp;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxwj;
import com.spire.presentation.packages.sprybk;
import com.spire.presentation.packages.spryhk;
import com.spire.presentation.packages.sprzeh;
import com.spire.presentation.packages.sprzlg;
import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;

public class sprpak
implements sprsp {
    private final sprrr cfr_renamed_91;
    private int cfr_renamed_0;
    private sprddm cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private ECPublicKey cfr_renamed_3;
    private final spryhk cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_9536(sprctg arg0, sprrr arg1) {
        sprctg sprctg2 = arg0;
        this.cfr_renamed_0 = sprctg2.cfr_renamed_8227();
        switch (sprctg2.cfr_renamed_8227()) {
            case 0: {
                while (false) {
                }
                sprpak sprpak2 = this;
                this.cfr_renamed_1 = new sprddm(sprwr.cfr_renamed_1226);
                break;
            }
            case 1: {
                sprpak sprpak2 = this;
                this.cfr_renamed_1 = new sprddm(sprwr.cfr_renamed_1226);
                break;
            }
            case 2: {
                sprpak sprpak2 = this;
                this.cfr_renamed_1 = new sprddm(sprwr.cfr_renamed_112);
                break;
            }
            default: {
                throw new IllegalArgumentException(sprqbz.cfr_renamed_9("\u0000\u000e\u001e\u000e\u001a\u0017\u001b@\u001e\u0005\f@\u0001\u0019\u0005\u0005"));
            }
        }
        sprpak2.cfr_renamed_3 = (ECPublicKey)new sprfzj(arg0, arg1).cfr_renamed_1521();
    }

    @Override
    public spryhk cfr_renamed_614() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpak(sprxwj sprxwj2, sprrr sprrr2) {
        void arg1;
        sprpak sprpak2 = this;
        sprpak2.cfr_renamed_4 = null;
        sprpak2.cfr_renamed_2 = null;
        this.cfr_renamed_91 = arg1;
        this.cfr_renamed_9536(sprxwj2.cfr_renamed_568(), (sprrr)arg1);
    }

    public static /* synthetic */ ECPublicKey cfr_renamed_9537(sprpak arg0) {
        return arg0.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprge cfr_renamed_576(int arg0) throws sprhjg {
        sprlj sprlj2;
        Object object;
        if (this.cfr_renamed_0 != arg0) {
            throw new sprhjg(new StringBuilder().insert(0, sprqry.cfr_renamed_9("R`J|B2SwW{C{@`\u0005tJ`\u0005sIuJ`LfM\u007f\u001f2")).append(arg0).toString());
        }
        try {
            object = new sprzlg().cfr_renamed_7401(this.cfr_renamed_91);
            sprlj2 = ((sprzlg)object).cfr_renamed_1451();
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage(), exception);
        }
        object = sprlj2.cfr_renamed_5279(this.cfr_renamed_1);
        try {
            sprpak sprpak2;
            byte[] byArray;
            Object object2;
            OutputStream outputStream = object.cfr_renamed_470();
            if (this.cfr_renamed_2 != null) {
                outputStream.write(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            }
            byte[] byArray2 = object.cfr_renamed_580();
            if (this.cfr_renamed_4 != null && this.cfr_renamed_4.cfr_renamed_102().cfr_renamed_8290()) {
                Object object3 = object2 = (Object)sprrih.cfr_renamed_8165(this.cfr_renamed_4.cfr_renamed_568().cfr_renamed_8295(), sprlrg.cfr_renamed_135.cfr_renamed_1451());
                outputStream.write((byte[])object3, 0, ((Object)object3).length);
                byArray = object.cfr_renamed_580();
                sprpak2 = this;
            } else {
                byArray = null;
                sprpak2 = this;
            }
            switch (sprpak2.cfr_renamed_0) {
                case 0: 
                case 1: {
                    object2 = this.cfr_renamed_91.cfr_renamed_1539("SHA256withECDSA");
                    return new sprybk(this, outputStream, (sprjj)object, (Signature)object2, byArray, byArray2);
                }
                case 2: {
                    object2 = this.cfr_renamed_91.cfr_renamed_1539("SHA384withECDSA");
                    return new sprybk(this, outputStream, (sprjj)object, (Signature)object2, byArray, byArray2);
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqbz.cfr_renamed_9("\u0003\u001d\u000f\u001c\u0003\u0010@")).append(this.cfr_renamed_0).append(sprqry.cfr_renamed_9("\u0005|Jf\u0005aPbU}Wf@v")).toString());
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage(), exception);
        }
    }

    @Override
    public boolean cfr_renamed_613() {
        return this.cfr_renamed_4 != null;
    }

    public /* synthetic */ sprpak(sprxwj arg0, sprrr arg1, sprybk arg2) {
        this(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprpak(spryhk spryhk2, sprrr sprrr2) {
        void arg0;
        sprpak sprpak2 = this;
        sprpak2.cfr_renamed_4 = arg0;
        sprpak2.cfr_renamed_91 = sprrr2;
        try {
            this.cfr_renamed_2 = arg0.cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprqbz.cfr_renamed_9("\u0015\u001b\u0001\u0017\f\u0010@\u0001\u000fU\u0005\r\u0014\u0007\u0001\u0016\u0014U\u0010\u0014\u0012\u0010\u000e\u0001@\u0011\u0001\u0001\u0001O@")).append(iOException.getMessage()).toString());
        }
        sprdfh sprdfh2 = arg0.cfr_renamed_568().cfr_renamed_8295();
        sprzeh sprzeh2 = sprdfh2.cfr_renamed_8242();
        if (sprzeh2.cfr_renamed_8233() instanceof sprctg) {
            void arg1;
            sprctg sprctg2 = sprctg.cfr_renamed_23(sprzeh2.cfr_renamed_8233());
            this.cfr_renamed_9536(sprctg2, (sprrr)arg1);
            return;
        }
        throw new IllegalArgumentException(sprqry.cfr_renamed_9("|Jf\u0005bPpI{F2SwW{C{FsQ{J|\u0005y@k"));
    }

    public /* synthetic */ sprpak(spryhk arg0, sprrr arg1, sprybk arg2) {
        this(arg0, arg1);
    }
}

