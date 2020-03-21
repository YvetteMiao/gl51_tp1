package gl51.service.impl

import gl51.data.Photo
import gl51.service.PhotoService
import gl51.service.UploadCloudService

import javax.inject.Inject
@Singleton
class UploadCloud implements UploadCloudService{
    @Inject
    PhotoService photoService

    @Override
    void upload() {

    }
}
