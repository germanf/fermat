package com.bitdubai.fermat_dap_plugin.layer.sub_app_module.asset.factory.developer.bitdubai.version_1;

import com.bitdubai.fermat_api.Plugin;

import java.util.UUID;

/**
 * Created by Franklin on 07/09/15.
 */
public class AssetFactorySubAppModulePluginRoot implements Plugin {

    UUID pluginId;

    @Override
    public void setId(UUID pluginId) {
        this.pluginId = pluginId;
    }

}