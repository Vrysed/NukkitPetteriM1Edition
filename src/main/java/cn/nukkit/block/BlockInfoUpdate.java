package cn.nukkit.block;

/**
 * Created by PetteriM1
 */
public class BlockInfoUpdate extends BlockSolid {

    public BlockInfoUpdate() {
    }

    @Override
    public int getId() {
        return INFO_UPDATE;
    }

    @Override
    public String getName() {
        return "Update Game Block";
    }
}
