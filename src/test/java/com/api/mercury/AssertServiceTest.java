package com.api.mercury;

import com.api.mercury.model.Asset;
import com.api.mercury.model.Store;
import com.api.mercury.model.Users;
import com.api.mercury.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;


@SpringBootTest
public class AssertServiceTest {


    /*    @Autowired
        private AssetService service;

        private Store store;
        private Users user;
        private HashMap<String, String> data;
        private Asset asset1;
        private Asset asset2;
        private Asset asset3;
        private Asset asset4;

        @Before
        public void setUp() throws Exception {
        super.setUp();
        store = new Store();
        store.setVisible(true);
        storeRepository.save(store);
        user = new User(UUID.randomUUID().toString());
        userRepository.save(user);
        asset1 = new Asset(AssetType.AADHAR_CARD.name(), "http://test.host/foo.png");
        asset1.setPid(store.getId());
        asset1.setParent(Constants.PARENT_STORE);
        asset2 = new Asset(AssetType.PROFILE.name(), "http://test.host/foo.png");
        asset2.setPid(store.getId());
        asset2.setParent(Constants.PARENT_STORE);
        asset3 = new Asset(AssetType.AADHAR_CARD.name(), "http://test.host/foo.png");
        asset3.setPid(user.getId());
        asset3.setParent(Constants.PARENT_USER);
        asset4 = new Asset(AssetType.AADHAR_CARD.name(), "http://test.host/foo.png");
        asset4.setPid(store.getId());
        asset4.setParent(Constants.PARENT_STORE);
        asset4.setDeleted(true);
        assetRepository.saveAll(Arrays.asList(asset1, asset2, asset3, asset4));
        data = new HashMap<String, String>() {{
            put("type", AssetType.AADHAR_CARD.name());
            put("title", "1234-5678-9000");
            put("url", "https://foo-aws.com/3123123d-3e2dwcw-3e2ddwd.jpeg");
        }};
    }

        @Test
        public void shouldAddStoreAsset() {
        Asset newAsset = new Asset(data.get("type"), data.get("url"));
        newAsset.setParent(Constants.PARENT_STORE);
        newAsset.setPid(store.getId());
        newAsset.setType(AssetType.AADHAR_CARD.name());
        Asset actual = service.add(newAsset);

        assertThat(actual.getId(), is(notNullValue()));
        assertThat(actual.getType(), is(AssetType.AADHAR_CARD.name()));
        assertThat(actual.getUrl(), is(data.get("url")));
        assertThat(actual.getPid(), is(store.getId()));
        assertThat(actual.getParent(), is(Constants.PARENT_STORE));
    }

        @Test
        public void shouldAddUserAsset() {
        Asset newAsset = new Asset(data.get("type"), data.get("url"));
        newAsset.setParent(Constants.PARENT_USER);
        newAsset.setPid(user.getId());
        newAsset.setType(AssetType.AADHAR_CARD.name());

        Asset actual = service.add(newAsset);

        assertThat(actual.getId(), is(notNullValue()));
        assertThat(actual.getType(), is(data.get("type")));
        assertThat(actual.getUrl(), is(data.get("url")));
        assertThat(actual.getPid(), is(user.getId()));
        assertThat(actual.getParent(), is(Constants.PARENT_USER));
    }

        @Test
        public void shouldFailToAddInvalidAsset() {
        Asset newAsset = new Asset(data.get("type"), "");
        Asset actual = service.add(newAsset);

        assertThat(actual.getId(), is(nullValue()));
        assertThat(actual.hasErrors(), is(true));
        assertThat(actual.getErrors().get("url"), is("is required"));
    }

        @Test
        public void shouldReturnListOfPrivateAssetForStore() {
        List<Asset> actual = service.getAssetsFor(store.getId(), asset1.getParent(), AssetType.privateTypes());
        assertThat(actual.size(), is(1));
        List<UUID> ids = actual.stream().map(Asset::getId).collect(Collectors.toList());
        assertThat(ids, hasItem(asset1.getId()));
        assertThat(ids, not(hasItems(asset2.getId(), asset3.getId(), asset3.getId())));
    }

        @Test
        public void shouldReturnListOfPublicAssetForStore() {
        List<Asset> actual = service.getAssetsFor(store.getId(), asset1.getParent(), AssetType.publicTypes());
        assertThat(actual.size(), is(1));
        List<UUID> ids = actual.stream().map(Asset::getId).collect(Collectors.toList());
        assertThat(ids, hasItem(asset2.getId()));
        assertThat(ids, not(hasItems(asset1.getId(), asset3.getId())));
    }

        @Test
        public void shouldReturnListOfAllAssets() {
        List<Asset> actual = service.getAssetsFor(store.getId(), asset1.getParent(), AssetType.allTypes());
        assertThat(actual.size(), is(2));
        List<UUID> ids = actual.stream().map(Asset::getId).collect(Collectors.toList());
        assertThat(ids, hasItems(asset1.getId(), asset2.getId()));
        assertThat(ids, not(hasItem(asset3.getId())));
        assertThat(ids, not(hasItem(asset4.getId())));
    }

        @Test
        public void shouldReturnEmptyList() {
        List<Asset> actual = service.getAssetsFor(UUID.randomUUID(), asset1.getParent(), AssetType.allTypes());
        assertThat(actual.size(), is(0));
    }
*/
}
