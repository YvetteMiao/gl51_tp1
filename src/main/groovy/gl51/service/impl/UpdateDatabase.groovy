package gl51.service.impl

import gl51.service.PhotoService
import gl51.service.UpdateDbService

import javax.inject.Inject

class UpdateDatabase implements UpdateDbService{
    @Inject
    PhotoService photoService
    @Override
    void update() {

    }
}
