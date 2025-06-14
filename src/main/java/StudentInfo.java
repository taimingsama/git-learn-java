public record StudentInfo(int id,String name)
{
    @Override
    public String toString()
    {
        return "StudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
