package in.succinct.bpp.search.db.model;

import com.venky.swf.db.annotations.column.indexing.Index;

public interface IndexedActivatableModel extends IndexedProviderModel {

    @Index
    public Boolean isActive();
    public void setActive(Boolean active);


}
